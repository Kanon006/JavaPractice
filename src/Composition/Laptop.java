package Composition;

public class Laptop {
protected Processor processor;
protected Graphics graphics;
private String display;
private String ram;
private  String rom;
private String os;

public Laptop(){
    this.processor=new Processor();
    this.graphics=new Graphics();
    this.display="IPS";
    this.ram="40 gb";
    this.rom="10 gb";
    this.os="windows/iOS";
}
public Laptop(Processor processor,Graphics graphics,String display,String ram,String rom,String os){
    this.processor=new Processor();
    this.graphics=new Graphics();
    this.display=display;
    this.ram=ram;
    this.rom=rom;
    this.os=os;

}

    @Override
    public String toString() {
        return "Laptop{" +
                "processor=" + processor +
                ", graphics=" + graphics +
                ", display='" + display + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
