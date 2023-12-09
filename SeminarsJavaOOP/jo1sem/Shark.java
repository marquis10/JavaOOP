import java.time.LocalDate;

public class Shark extends Animal{
    public Shark(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }

    public Shark() {
        super();
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " doesn't float");
    }

    @Override
    public void toGo() {
        System.out.println(getClass().getSimpleName() + " can't run");
    }
}
