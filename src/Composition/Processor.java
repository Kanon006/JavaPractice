package Composition;

public class Processor {
    private String generation;
    private String name;
    private String speed;

    public Processor(){
        this.generation="12 generation";
        this.name="Intel";
        this.speed="100Ghz";

    }
    public Processor(String generation,String name,String speed){
        this.generation=generation;
        this.name=name;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "generation='" + generation + '\'' +
                ", name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
