package Over;

class OverlodingTest{
    void apple(){
        System.out.println("apple");
    }
    void apple(int a){
        System.out.println("int a = "+ a);
    }
    void apple(String a){
        System.out.println("String a = "+ a);
    }
}

class OverridingTest extends OverlodingTest{
    @Override
    void apple() {
        super.apple();
        System.out.println("Overriding apple");
    }
}
public class Main {
    public static void main(String[] args){
        OverlodingTest olt = new OverlodingTest();
        olt.apple();
        olt.apple(5);
        olt.apple("string");

        OverridingTest ort = new OverridingTest();
        ort.apple();
    }
}
