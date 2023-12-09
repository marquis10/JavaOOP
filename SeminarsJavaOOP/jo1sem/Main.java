import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("Marquis");
//        System.out.println(cat.getName());
        Animal dog = new Dog("Barbos", new Chumka("chumka"),
                "petr", LocalDate.of(2009,05,24));
//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
//        dog.getIllness().heal();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
//        cat.lifeCycle();
//        cat.breathe();
//        dog.breathe();
        dog.toGo();
        dog.swim();
        dog.fly();
        cat.toGo();
        cat.swim();
        cat.fly();
        Animal eagle = new Eagle();
        eagle.toGo();
        eagle.swim();
        eagle.fly();
        Duck duck = new Duck();
        duck.toGo();
        duck.swim();
        duck.fly();
        Shark shark = new Shark();
        shark.toGo();
        shark.swim();
        shark.fly();
    }
}