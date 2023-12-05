import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String owerName;
    private LocalDate birthDay;

    public Animal(String name, Illness illnes, String owerName, LocalDate birthDay) {
        this.name = name;
        this.illness = illnes;
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

    public Illness getIllness() {
        return illness;
    }

    public void wakeUp(){
        System.out.println("Animal woke up");
    }

    public void wakeUp(String time){
        System.out.println("Animal woke up in " + time);
    }
}