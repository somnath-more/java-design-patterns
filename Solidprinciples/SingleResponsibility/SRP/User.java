package Solidprinciples.SingleResponsibility.SRP;

// User class with constructor, getters, and no logic for persistence
public class User {
    private String name;
    private String email;

    public User(String name, String email) { // Constructor fixed
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
