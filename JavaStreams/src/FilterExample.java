import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class FilterExample {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C");

        //Imperative Style
        System.out.println("Imperative Style");
        for(String name : names)
        {
            if(isNotSame(name))
            {
                System.out.println(name);
            }
        }

        //Functional Style using Anonymous Inner Class
        System.out.println("Functional Style using Anonymous Inner Class");
        names.stream()
        .filter(new Predicate<String>(){
            @Override
            public boolean test(String name) {
                return !name.equals("C");
            }
        })
        .forEach(new Consumer<String>(){
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
        
        //Functional Style using Lambda Expressions
        System.out.println("Functional style using Lambda Expressions");
        names.stream()
        .filter(name -> !name.equals("C"))
        .forEach(name -> System.out.println(name));

        
        //Functional Style using Method Reference
        System.out.println("Functional Style using Method Reference");
        names.stream()
        .filter(FilterExample :: isNotSame)
        .forEach(System.out :: println);

        

        Stream.of(1,2,3).filter(new Predicate<Integer>(){
            @Override
            public boolean test(Integer t) {
                return t != 3;
            };
        })
        .forEach(new Consumer<Integer>(){
            public void accept(Integer t) {
                System.out.println(t);
            };
            @Override
            public Consumer<Integer> andThen(Consumer<? super Integer> after) {
                return Consumer.super.andThen(after);
            }
        });

        Stream.of(1, 2, 3).filter(num -> num != 2).forEach(num -> System.out.println(num));

        Stream.of(1, 2, 3).filter(num -> num != 1).forEach(System.out :: println);

    }

    private static boolean isNotSame(String name) {
        return !name.equals("C");
    }
}
