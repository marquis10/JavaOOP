import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        //cat.setName("Marquis");
        System.out.println(cat.getName());
        Animal dog = new Animal("Barbos", "chumka", "petr",
                LocalDate.of(2009,05,24));
        System.out.printf(dog.getName());
    }
}
