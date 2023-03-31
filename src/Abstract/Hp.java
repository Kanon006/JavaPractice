package Abstract;

public class Hp extends Laptop{
    @Override
    public void ram() {

    }

    @Override
    public void processor() {
        System.out.println("core i11");

    }

    @Override
    public void graphics(String intel, String amd) {
        System.out.println(intel+"\n"+amd);

    }
}
