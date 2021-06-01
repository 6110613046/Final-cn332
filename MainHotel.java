import java.util.ArrayList;
import java.util.Scanner;

public class MainHotel {
    static Hotel Hotelroom = new Hotel();
    static Allclient allclient = new Allclient();
    static HotelFactory hotelFactory ;
    static int ans;
    static Scanner scanner= new Scanner(System.in);

    public static void main(String ...args){

    while(true){
        System.out.println("1 - Create Client User");
        System.out.println("2 - Login");   
        System.out.println("3 - Exit");       
        ans=scanner.nextInt();  
         if (ans == 1)
        {
            createUser();
        }
        else if (ans == 2)
        {
            userlogin();
            
        }
        else if (ans == 3)
        {
            System.out.println("Exit Complete");
            break;
        }

    }  
   }
    static void createUser(){    
        scanner.nextLine();
        System.out.println("enter client name id");
        System.out.print("input : ");
        String name = scanner.nextLine();
        System.out.println("enter client address");
        System.out.print("input : ");
        String address = scanner.nextLine();
        System.out.println("enter client phone");
        System.out.print("input : ");
        String phone = scanner.nextLine();
        System.out.println("enter client password");
        System.out.print("input : ");
        String password = scanner.nextLine();

        Client newClient = new Client(name, address, phone, password);
        allclient.ArrayClient(newClient);}


    static void userlogin()
           {
            System.out.println("face detect inprocess");
            System.out.println("enter account id");
            System.out.print("input : ");
            String id = scanner.next();
            System.out.println("enter account password");
            System.out.print("input : ");
            String password = scanner.next();

            if (allclient.ClientArrayList.size() != 0){
            for (Client num : allclient.ClientArrayList) { 		      
                if ((num.getName().equals(id) ) && (num.getPassword().equals(password)))
                {
                    System.out.println("Login Complete");
                    Hotelroom.setHotel();
                    System.out.println("Room Promotion");
                    String room = "yes";
                    if (room.equals("yes"))
                    {
                    for (String a : Hotelroom.HoteltArrayList)
                    {
                        System.out.println(a);
                    }
                    System.out.println("Choose Your room");
                    System.out.println("1 for room a");
                    System.out.println("2 for room b");  
                    System.out.println("3 for room c");
                    System.out.println("4 for room d");
                    System.out.print("input : ");
                    String aroom = scanner.next();
                    System.out.println("1 - wifi , 2 - no wifi ");
                    System.out.print("input : ");
                    String broom = scanner.next();
                    System.out.println("duration");
                    System.out.print("input : ");
                    int croom = scanner.nextInt();
                    HotelFactory hotelFactory = new HotelFactory(aroom , broom , croom);
                    int cost = hotelFactory.cost();
                    String output = String.format("Your room cost %d", cost);
                    System.out.println(output);  
                    System.out.println("Choose your pay way bank or paypal");
                    System.out.print("input : ");
                    /* choose payment*/
                    String pay = scanner.next();
                    System.out.println("go api what user choose");
                    num.setClientRoom(hotelFactory);
                    
                }
              }
              else {System.out.println("Not have this user");}
            }
        }
        else {System.out.println("Please Create Client User");}
}}


