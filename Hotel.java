import java.util.ArrayList;

public class Hotel {
    ArrayList<String> HoteltArrayList = new ArrayList<String>();
    
    
    public void setHotel ()
    {
        HoteltArrayList.add("Room 1 bed");
        HoteltArrayList.add("Room 2 bed");
        HoteltArrayList.add("Room 3 bed");
        HoteltArrayList.add("Room 4 bed");
    }
    public ArrayList<String> getArraylist()
    {
        return HoteltArrayList;
    }
    
}
