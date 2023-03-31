package Interface;

public class NonVeg implements Person{         //Absulate Abstract(All method must call when child class implemantatiin   )

    @Override
    public String men() {
        return "BKC";
    }

    @Override
    public String woman() {
        return null;
    }

    @Override
    public String middleMan() {
        return "CDN";
    }
}
