package project.word;

public class Word {
    private String nativeWord;
    private String foreignWord;

    public Word(String nativeWord, String foreignWord) {
        this.nativeWord = nativeWord;
        this.foreignWord = foreignWord;
    }

    public String getNativeWord() {
        return nativeWord;
    }

    public String getForeignWord() {
        return foreignWord;
    }


}
