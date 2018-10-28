package project.model;

public class Word {
    private String polishWord;
    private String foreignWord;

    public Word(String polishWord, String foreignWord) {
        this.polishWord = polishWord;
        this.foreignWord = foreignWord;
    }

    public String getPolishWord() {
        return polishWord;
    }

    public String getForeignWord() {
        return foreignWord;
    }
}
