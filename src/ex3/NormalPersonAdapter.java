package ex3;

public class NormalPersonAdapter implements Gamer {
    private NormalPerson normalPerson;

    public NormalPersonAdapter(NormalPerson normalPerson) {
        this.normalPerson = normalPerson;
    }

    @Override
    public void play() {
        normalPerson.work(); // Adapt work action to play action
    }

    @Override
    public void pause() {
        normalPerson.eat(); // Adapt eat action to pause action
    }
}

