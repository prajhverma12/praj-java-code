import java.util.List;

public class User {
    
    private String name;
    private int age;
    private List<String> phoneNumbers;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public User(String name, int age, List<String> phoneNumbers) {
        this.name = name;
        this.setAge(age);
        this.setPhoneNumbers(phoneNumbers);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
