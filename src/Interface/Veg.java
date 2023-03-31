package Interface;

public class Veg implements Person{
    @Override
    public String men() {
        return "Nishat";
    }

    @Override
    public String woman() {
        return "Sohana";
    }

    @Override
    public String middleMan() {
        return null;
    }

}
