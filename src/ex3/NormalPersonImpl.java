package ex3;

public class NormalPersonImpl implements NormalPerson {
    @Override
    public void work() {
        System.out.println("Working hard...");
    }

    @Override
    public void eat() {
        System.out.println("Eating a meal...");
    }
}
