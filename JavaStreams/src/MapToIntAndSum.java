import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapToIntAndSum {
    
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
        new User("Peter", 20, Arrays.asList("1", "2")), 
        new User("Sam", 30, Arrays.asList("3", "5")));

        //Imperative Style
        System.out.println("Imperative Style");
        int sum = 0;
        for(User user : users) {
            sum = sum + user.getAge();
        }
        System.out.println("The total age is :- " + sum);

        //Functional Style using Anonymous Inner Class
        System.out.println("Functional Style using Anonymous Inner Class");
        int sum1 = users.stream().mapToInt(new ToIntFunction<User>() {
            @Override
            public int applyAsInt(User value) {
                return value.getAge();
            }
        }).sum();
        System.out.println("The total age is :- " + sum1);

        //Functional Style using Lambda Expression
        System.out.println("Functional Style using Lambda Expression");
        int sum2 = users.stream().mapToInt(user -> user.getAge()).sum();
        System.out.println("The total age is :- " + sum2);

        //Functional Style using Method Reference
        System.out.println("Functional Style using Method Reference");
        int sum3 = users.stream().mapToInt(User :: getAge).sum();
        System.out.println("The total age is :- " + sum3);
    }
}
