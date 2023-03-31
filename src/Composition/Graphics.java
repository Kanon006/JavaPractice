package Composition;

public class Graphics {
 protected String graphicsName;
 protected String chipset;
 public String model;

 public Graphics(){
     this.graphicsName="AMD";
     this.chipset="Nvidia";
     this.model="NRX";
 }
 public Graphics(String graphicsName,String chipset,String model){
     this.graphicsName=graphicsName;
     this.chipset=chipset;
     this.model=model;
 }

    @Override
    public String toString() {
        return "Graphics{" +
                "graphicsName='" + graphicsName + '\'' +
                ", chipset='" + chipset + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
