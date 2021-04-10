package InterfaceTest;

class MysqlConnect implements DBConnect{
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
        MysqlConnect mc = new MysqlConnect();
        mc.dbName("Mysql");
        mc.dbIp("0.0.0.0");
    }
}
