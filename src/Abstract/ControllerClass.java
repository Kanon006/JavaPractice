package Abstract;

public class ControllerClass {
    public static void main(String[] args) {
        Laptop dell=new Dell();
        Laptop hp=new Hp();
        dell.ram();
        dell.graphics("intel iRIS","directX 11");
        hp.processor();
        hp.graphics("intel ultra","directX 9");
    }
}
