package src.sem451.copy;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataTasks {
	public void saveDataToFile()throws FileNotFoundException,IOException,Exception;
	public void loadDataFromFile() throws FileNotFoundException,IOException,Exception;
	
}
