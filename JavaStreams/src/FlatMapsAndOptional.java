import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class FlatMapsAndOptional {
    
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
            new User("Peter", 20, Arrays.asList("1", "2")), 
            new User("Sam", 30, Arrays.asList("3", "5")));

        //Functional Style to get User with phoneno with 5
        Optional<String> stringOptional = users.stream()
        .map(user -> user.getPhoneNumbers().stream())
        .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5")))
        .findAny();

        stringOptional.ifPresent(phoneNo -> System.out.println(phoneNo));
    }
}