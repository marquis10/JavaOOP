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

    private void wakeUp(){
        System.out.println(getClass().getSimpleName() + " woke up");
    }

    private void wakeUp(String time){
        System.out.println(getClass().getSimpleName() + " woke up in " + time);
    }

    private void eat(){
        System.out.println(getClass().getSimpleName() + " eat");
    }

    private void play(){
        System.out.println(getClass().getSimpleName() + " go to play");
    }

    private void sleep(){
        System.out.println(getClass().getSimpleName() + " go to bed");
    }

    public void lifeCycle(){
        wakeUp();
        play();
        eat();
        sleep();
    }

    public void breathe(){
        System.out.println("breathe");
    }

    public void toGo(){
        System.out.println(getClass().getSimpleName() + " is running");
    }

    public void fly(){
        System.out.println(getClass().getSimpleName() + " flies");
    }

    public void swim(){
        System.out.println(getClass().getSimpleName() + " swims");
    }

}