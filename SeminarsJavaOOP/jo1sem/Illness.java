public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }

    public void heal(){
        System.out.println("Выпить 5 таблеток парацетамола");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}