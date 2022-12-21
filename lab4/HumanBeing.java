package lab3;

public class HumanBeing extends Human{
    HumanBeing(String name, IsAdult grownup, Gender gender){
        this.name=name;
        this.grownup=grownup;
        this.gender=gender;
    }
    public void read(Object obj){
        if(obj.Amount==1){
            System.out.println(name + " читает " + obj.name);
        }
        else{
            String CurName=obj.name.substring(0,obj.name.length()-1);
            System.out.println(name+" читает "+ CurName+"ы");
        }
    }
    public void sit(Object obj){
        System.out.println(name+" сидит на "+ obj.name);
    }

    public void think(){
        System.out.println(name+" о чем-то задумывается");
    }

    public  void say(HumanBeing hum, Phrases phrase){
        System.out.println(name+ " говорит "+ hum.name+ ":");
        System.out.println(phrase.getPhrase());
    }

    public void feel(Intentions intent, Intensity intense, HumanBeing human, Kinship kins) throws TheImpossibleAction{
        if (kins==Kinship.MOTHER & intent==Intentions.MARRY) {
            throw new TheImpossibleAction(name + " не может пожениться на "+human.getName());

        } else{
            System.out.println(name + " " + intense.getIntense() + intent.getIntent() + kins.getKins() + human.getName());
        }
    }

    public void hug(HumanBeing hum, ObjectAbstract obj){
        System.out.println(name + " обнял " + hum.getName() + " за " + obj.getName());
    }

    public void decide() throws NotTheRightPerson{
        if (grownup== IsAdult.Yes) {
            System.out.println(name + " решил следующее:");
        } else{
            throw new NotTheRightPerson(name+" еще слишком мал чтобы что-то решать.");
        }
    }




}