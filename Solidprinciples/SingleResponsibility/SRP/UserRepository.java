package Solidprinciples.SingleResponsibility.SRP;

public class UserRepository {
    public void save(User user) {
        // Logic to save user to database
        System.out.println("User saved successfully: " + user.getName() + ", " + user.getEmail());
    }
}
