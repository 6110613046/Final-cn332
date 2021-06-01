import java.util.ArrayList;

public class Allclient {
    ArrayList<Client> ClientArrayList = new ArrayList<Client>();
    
    
    public void ArrayClient (Client c){
        ClientArrayList.add(c);       
}
    public ArrayList<Client> getArraylist()
    {
        return ClientArrayList;
    }
    
}
