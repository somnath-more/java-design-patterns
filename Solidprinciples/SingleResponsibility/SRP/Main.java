package Solidprinciples.SingleResponsibility.SRP;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john@example.com"); // fixed constructor args
        UserRepository userRepository = new UserRepository();
        userRepository.save(user);
    }
}
