import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class FlatMapsAndOptional {
    
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
        new User("Peter", 20, Arrays.asList("1", "2")), 
        new User("Sam", 30, Arrays.asList("3", "5")));

        //Imperative Style to find user with Phone Number 5
        System.out.println("Imperative Style to find user with Phone Number 5");
        for(User user : users) {
            for(String phno : user.getPhoneNumbers()) {
                if(phno.equals("5")) {
                    System.out.println("User - " + user.getName() + " is having Phone Number - " + phno);
                }
            }
        }

        //Functional Style using Lambda Expression to find user with Phone Number 5
        System.out.println("Functional Style using Lambda Expression to find user with Phone Number 5");
        Optional<String> stringOptional = users.stream()
        .map(user -> user.getPhoneNumbers().stream())
        .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5")))
        .findAny();
        stringOptional.ifPresent(phoneNo -> System.out.println(phoneNo));

        // Optional<String> stringOptional1 = users.stream()
        // .map(new Function<User, Object>() {
        //     @Override
        //     public Object apply(User t) {
        //         return t.getPhoneNumbers().stream();
        //     };
        // }).flatMap(new Function<Stream<String>,Stream<? extends Object>>() {
        //     public java.util.stream.Stream<? extends Object> apply(java.util.stream.Stream<String> t) {
        //         return t.filter(phoneNo -> phoneNo.equals("5"));
        //     };
        // }).findAny();
    }
}