package lab3;

public enum IsAdult {
    Yes("взрослый"),
    No("дитя");

    protected String grown;

    IsAdult(String grown){
        this.grown=grown;
    }

    public String getAge(){
        return grown;
    }
}
