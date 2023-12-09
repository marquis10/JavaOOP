import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }
    public Fish() {
        super();
    }
}
