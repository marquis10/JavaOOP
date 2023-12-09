import java.time.LocalDate;

public class Eagle extends Animal{
    public Eagle(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }

    public Eagle() {
        super();
    }
    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " can't swim");;
    }
}