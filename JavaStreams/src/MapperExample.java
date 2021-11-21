import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;

public class MapperExample {
    
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Prajwal", "Arnav");

        //Imperative Style
        System.out.println("Imperative Style");
        for(String name: names) {
            if(!name.equals("Sam")) {
                User user = new User(name);
                System.out.println(user);
            }
        }

        //Functional Style using Anonymous class
        System.out.println("Fuctional Style using Anonymous class");
        names.stream().map(new Function<String, Object>(){
           @Override
           public Object apply(String t) {
               return new User(t);
           } 
        })
        .filter(new Predicate<Object>(){
            @Override
            public boolean test(Object t) {
                return !t.toString().equals("Sam");
            }
        })
        .forEach(new Consumer<Object>(){
            @Override
            public void accept(Object t) {
                 System.out.println(t);   
            }
        });

        //Functional Style using Lambda Expression
        System.out.println("Functional Style using Lambda Expression");
        names.stream()
        .map(name -> new User(name))
        .filter(user -> !user.toString().equals("Sam"))
        .forEach(user -> System.out.println(user));

        //Functional Style using Method Reference
        System.out.println("Functional Style using Method Reference");
        names.stream()
        .map(User :: new)
        .filter(MapperExample :: isNotSam)
        .forEach(System.out :: println);

    }

    public static boolean isNotSam(User user) {
        return !user.toString().equals("Sam");
    }

}