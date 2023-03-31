package Composition;

public class Controller {
    public static void main(String[] args) {
        Controller con=new Controller();
        Processor ps=new Processor();
        Graphics gp=new Graphics();
        Laptop lp=new Laptop();
        Laptop laptop=new Laptop(ps,gp,"amd","40 gb","10 gb","mac");
        System.out.println(ps);
        System.out.println(gp);
        System.out.println(laptop);
    }

}
