package project.dataValidator;

public class DataCSVLineValidator implements DataLineValidator {

    public boolean isDataValid(String line) {
        if(line.isEmpty())
            return false;
        String [] array = line.split(",");
        if(array.length != 2)
            return false;
        return true;
    }
}
