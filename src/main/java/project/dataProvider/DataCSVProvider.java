package project.dataProvider;

import project.dataValidator.DataCSVLineValidator;
import project.dataValidator.DataLineValidator;
import project.word.Word;
import project.word.WordList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataCSVProvider implements DataProvider {
    private String fileName;
    private DataLineValidator validator;

    public DataCSVProvider(String fileName) {
        this.fileName = fileName;
        validator = new DataCSVLineValidator();
    }

    @Override
    public WordList getData() {
        WordList wordList = new WordList();
        try {
            Files.lines(Paths.get(fileName)).forEach(s -> {
            if(validator.isDataValid(s)) {
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
