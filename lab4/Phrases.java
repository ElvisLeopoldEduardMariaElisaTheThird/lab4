package lab3;

public enum Phrases {

    One("-Я давно хотел сказать тебе"),
    Two("-Я хочу жениться"),
    Three("-Болят мои ноги"),
    Four("-Что ты хочешь узнать?"),
    Five("-Ничего нового"),
    Six("-Повозка поскрипывает"),
    Seven("Не нужно верить всему что говорят"),
    Eight("Я думаю тебе стоит дать колбасу");

    protected String phrase;
    Phrases(String phrase){this.phrase=phrase;}
    public String getPhrase(){return phrase;}
}
