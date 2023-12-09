import java.time.LocalDate;

public class Bird extends Animal{
    public Bird(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }
    public Bird() {
        super();
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " doesn't float");;
    }
}