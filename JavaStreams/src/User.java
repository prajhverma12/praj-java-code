public class User {
    
    private String name;
    //private final int age = 30;

    public User(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
