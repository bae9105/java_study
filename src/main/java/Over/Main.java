package Over;

import InterfaceTest.DBConnect;

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
class OracleCN implements DBConnect{

    @Override
    public void dbName(String a) {
        System.out.println(a);
    }

    @Override
    public void dbIp(String b) {
        System.out.println(b);
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

        OracleCN OCN = new OracleCN();
        OCN.dbName("ORACLE");
        OCN.dbIp("1.1.1.1");
    }
}
