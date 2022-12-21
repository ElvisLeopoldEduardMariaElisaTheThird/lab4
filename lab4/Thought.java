package lab3;

public class Thought {
    HumanBeing hum;
    public Thought(HumanBeing hum){
        this.hum=hum;
    }

    private class Consequences{
        public void concern(){
            System.out.println("Мысль встревожила "+hum.getName());
        }
        public void calmness(){
            System.out.println(hum.getName() + " остался спокоен");
        }
    }
    void occure(){
        System.out.println("В голову "+ hum.getName()+" пришла мысль");
        Consequences con = new Consequences();
        con.concern();
    }


}
