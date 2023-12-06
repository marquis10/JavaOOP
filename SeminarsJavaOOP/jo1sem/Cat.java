import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }
    public Cat() {
        super();
    }
}