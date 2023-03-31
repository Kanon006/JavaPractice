package Abstract;

public class Dell extends Laptop{
    @Override
    public void ram() {
        System.out.println("32gb");

    }

    @Override
    public void processor() {

    }

    @Override
    public void graphics(String intel, String amd) {
        //intel="intel iRIS";
       // amd="directX 11";
        System.out.println(intel+"\t\t"+amd);

    }
}
