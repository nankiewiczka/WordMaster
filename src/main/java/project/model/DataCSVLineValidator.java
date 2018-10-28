package project.model;

public class DataCSVLineValidator implements DataLineValidator {
    public boolean validLine(String line) {
        if(line.isEmpty())
            return false;
        String [] array = line.split(",");
        if(array.length != 2)
            return false;
        return true;
    }
}
