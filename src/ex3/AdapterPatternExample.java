package ex3;

public class AdapterPatternExample {
    public static void main(String[] args) {
        NormalPerson normalPerson = new NormalPersonImpl();
        Gamer gamer = new NormalPersonAdapter(normalPerson);
        gamer.play();
        gamer.pause();
    }
}

