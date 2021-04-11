package InheritanceTest;

public class Kia extends Car{
    public void speed(int a){
        System.out.println(this.name + " - speed is " + a + "km/h");
    }
    public static void main(String args[]){
        Kia kia = new Kia();
        kia.name = "K5";
        kia.speed(240);
    }
}
