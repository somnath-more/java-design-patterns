package builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i7", "16GB")
                .build();
        System.out.println(computer);
    }
}
