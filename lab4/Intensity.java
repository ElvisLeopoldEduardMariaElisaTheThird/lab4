package lab3;

public enum Intensity {
    USUALLY("чаще всего "),
    ESPECIALLY("особенно "),
    THE_MOST("больше всего "),
    AT_LAST("наконец "),
    SOMETIMES("иногда "),
    NONE("");

    protected String intense;

    Intensity(String intense){
        this.intense=intense;
    }

    public String getIntense(){
        return intense;
    }


}
