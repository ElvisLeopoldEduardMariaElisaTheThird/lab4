package lab3;

import java.util.Objects;

public abstract class Human implements Being{

    protected IsAdult grownup;
    protected String name;
    protected Gender gender;

    @Override
    public IsAdult getAge(){
        return this.grownup;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Gender getGender(){
        return this.gender;
    }

    @Override
    public int hashCode(){
        return Objects.hash(grownup, name, gender);
    }



}