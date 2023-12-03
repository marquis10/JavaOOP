import java.time.LocalDate;

public class Animal {
    private String name;
    public String illnes;
    private String owerName;
    private LocalDate birthDay;

    public Animal(String name, String illnes, String owerName, LocalDate birthDay) {
        this.name = name;
        this.illnes = illnes;
        this.owerName = owerName;
        this.birthDay = birthDay;
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}