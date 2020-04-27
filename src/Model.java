
import org.json.simple.JSONObject;

public interface Model 
{

    PSSTask createTask(String[] list_format, JSONObject jsonObject);
    void deleteTask(String name, String type);
    void editTask(String[] list_format, String[] input, int index);
    boolean checkForOverlap();

    //sendError();

}
