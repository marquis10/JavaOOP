import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }
    public Dog() {
        super();
    }
}