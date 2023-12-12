package JavaOOP.lection2.Ex000;

//class Doo extends Foo{
//    public void M(){
//        Foo.();
//    }
//}

public class Foo {
    public Integer value;

    private static Integer count;
    public static Integer getCount(){
        return count;
    }

    static {
        count = 0;
    }

    public Foo(){
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
