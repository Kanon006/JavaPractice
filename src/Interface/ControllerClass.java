package Interface;

public class ControllerClass {
    public static void main(String[]args){
        Veg v = new Veg();
        NonVeg nV = new NonVeg();
        v.men();
        v.woman();
        v.middleMan();
        System.out.println("man-"+v.men()+"\n"+"woman="+v.woman()+"\n"+"middleMan-"+v.middleMan());
        nV.men();
        System.out.println(nV.men());

    }
}
