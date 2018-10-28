package project.data;

import project.model.Word;
import project.model.WordList;

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
        //TODO dodć trim() i to Uppercase
        WordList wordList = new WordList();
        DataLineValidator validator = new DataCSVLineValidator();
        try {
            Files.lines(Paths.get(fileName)).forEach(s -> {
            if(validator.validLine(s)) {
                String [] arr = s.split(",");
                wordList.addWord(new Word(arr[0], arr[1]));
            }
            });
        }catch(IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}
