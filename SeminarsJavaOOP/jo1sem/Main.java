import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Marquis");
        System.out.println(cat.getName());
        Animal dog = new Animal("Barbos", new Chumka("chumka"),
                "petr", LocalDate.of(2009,05,24));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        dog.wakeUp();
        dog.wakeUp("12:00");
    }
}