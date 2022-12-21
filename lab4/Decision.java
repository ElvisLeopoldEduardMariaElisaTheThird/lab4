package lab3;

public class Decision {
    public HumanBeing hum;
    Decision(HumanBeing hum){
        this.hum=hum;
    }

    public void referingPerson(){
        System.out.print(hum.getName());
    }

    public static class Type{
        public void getType(){
            System.out.println(" больше ни о чем его не расспрашивать, но при случае поговорить с Гуниллой.");
        }
    }
}
