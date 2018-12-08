package project.data;

import project.word.Word;
import project.word.WordList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataCSVProvider implements DataProvider {
    private String fileName;

    public DataCSVProvider(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public WordList getData() {
        WordList wordList = new WordList();
        DataLineValidator validator = new DataCSVLineValidator();
        try {
            Files.lines(Paths.get(fileName)).forEach(s -> {
            if(validator.validLine(s)) {
                String [] arr = s.split(",");
                wordToUpperCase(arr);
                wordTrim(arr);
                wordList.addWord(new Word(arr[0], arr[1]));
            }
            });
        }catch(IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }

    private void wordToUpperCase(String [] arr) {
        for(int i=0; i<arr.length; i++)
            arr[i]= arr[i].toUpperCase();
    }

    private void wordTrim(String [] arr) {
        for(int i=0; i<arr.length; i++)
            arr[i]= arr[i].trim();
    }

}
