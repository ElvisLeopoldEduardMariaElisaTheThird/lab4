package lab3;

import java.util.Random;

public class Main{
    public static void main(String[] args){
        //создание персонажей
        HumanBeing Malish = new HumanBeing("Малыш", IsAdult.No, Gender.Male);
        HumanBeing Father = new HumanBeing("Папа", IsAdult.Yes, Gender.Male);
        HumanBeing Mother = new HumanBeing("Мама", IsAdult.Yes, Gender.Female);
        HumanBeing Bosse = new HumanBeing("Боссе", IsAdult.No, Gender.Male);
        HumanBeing Betan = new HumanBeing("Бетан", IsAdult.No, Gender.Male);
        HumanBeing Karlson = new HumanBeing("Карлсон", IsAdult.No, Gender.Male);
        HumanBeing Gunilla = new HumanBeing("Гунилла", IsAdult.No, Gender.Female);

        //создание объектов
        Object Gazeta = new Object("газета", 1);
        Object Koleni = new Object("колени", 1);
        ObjectAbstract plechi = new ObjectAbstract() {
            @Override
            public String getName() {
                return "Плечи";
            }
            @Override
            public int getAmount() {
                return 2;
            }

        };




        Random random = new Random();

        Mother.hug(Malish, plechi);

        try{Mother.decide();} catch (NotTheRightPerson e){System.err.println(e.getMessage());}

        Decision dec= new Decision(Mother);
        dec.referingPerson();
        Decision.Type reshenie = new Decision.Type();
        reshenie.getType();

        System.out.println();



        Mother.read(Gazeta);
        Malish.sit(Koleni);

        int a = random.nextInt(100);

        if (a<40) {
            try{Malish.decide();} catch (NotTheRightPerson | TheImpossibleAction e){System.err.println((e.getMessage()));}
        } else if (a<60){
            Malish.read(Gazeta);
        } else if(a<80){
            Malish.say(Malish, Phrases.values()[random.nextInt(Phrases.values().length)]);
        } else{
            Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Father, Kinship.FATHER);
        }

        Intentions.values()[random.nextInt(Intentions.values().length)].getIntent();

        System.out.println();

        System.out.println("Малыш размышляет над тем кого же он любит");

        try{
            Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Mother, Kinship.MOTHER);
        } catch(TheImpossibleAction e){System.err.println(e.getMessage());}
        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Father, Kinship.FATHER);

        System.out.println();

        Malish.say(Mother, Phrases.values()[random.nextInt(Phrases.values().length)]);
        Mother.say(Malish, Phrases.values()[random.nextInt(Phrases.values().length)]);

        System.out.println();

        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Bosse, Kinship.BROTHER);
        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Betan, Kinship.SISTER);

        System.out.println();

        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Bosse, Kinship.BROTHER);
        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Betan, Kinship.SISTER);

        System.out.println();

        Malish.say(Mother, Phrases.values()[random.nextInt(Phrases.values().length)]);
        Mother.say(Malish, Phrases.values()[random.nextInt(Phrases.values().length)]);

        System.out.println();

        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Karlson, Kinship.NONE);

        Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Gunilla, Kinship.NONE);

        try{
            Malish.feel(Intentions.values()[random.nextInt(Intentions.values().length)], Intensity.values()[random.nextInt(Intensity.values().length)], Mother, Kinship.MOTHER);
        } catch(TheImpossibleAction e){System.err.println(e.getMessage());}

        //System.out.println("Как бы Малыш ни хотел жениться на маме, это невозможно");


        System.out.println();

        Thought misli = new Thought(Malish);
        misli.occure();




    }
}