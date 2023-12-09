import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String name, Illness illnes, String owerName, LocalDate birthDay) {
        super(name, illnes, owerName, birthDay);
    }
    public Duck() {
        super();
    }

}
