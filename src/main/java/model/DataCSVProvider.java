package main.java.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class DataCSVProvider implements DataProvider {
    private String fileName;

    public DataCSVProvider(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Word> getData() {
        List<Word> wordsList = new ArrayList<>();
        DataLineValidator validator = new DataCSVLineValidator();
        try {
            Files.lines(Paths.get(fileName)).forEach(s -> {
            if(validator.validLine(s)) {
                String [] arr = s.split(",");
                wordsList.add(new Word(arr[0], arr[1]));
            }
            });
        }catch(IOException e) {
            e.printStackTrace();
        }
        return wordsList;
    }
}
