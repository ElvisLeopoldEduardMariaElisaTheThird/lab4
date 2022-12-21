package lab3;

public enum Kinship {
    MOTHER("мама "),
    FATHER("папа "),
    BROTHER("брат "),
    SISTER("сестра "),
    NONE("");

    protected String kins;

    Kinship(String kins){
        this.kins=kins;
    }

    public String getKins(){
        return kins;
    }
}
