import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DeathCauseStatistickList {
    ArrayList<DeathCauseStatistic> DeathCauseStatistickArrList = new ArrayList<>();


    public void repopulate(String path){
        try {
            BufferedReader br= new BufferedReader(new FileReader(path));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

