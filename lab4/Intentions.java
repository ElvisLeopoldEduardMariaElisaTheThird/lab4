package lab3;

import java.util.Objects;

public enum Intentions {
    LOVE("любит "),
    HATE("ненавидит "),
    NONE("безразлтчен к "),
    ANGER("злится на "),
    MARRY("хочет пожениться ");
    protected String intent;
    Intentions(String intent){
        this.intent=intent;
    }

    public  String getIntent(){ return intent;}
}
