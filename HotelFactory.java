public class HotelFactory {
      int money;
      String room_bed;
      String wifi;
      int duration ;
      
      public HotelFactory(String room_bed, String wifi,  int duration)
      {
        this.room_bed = room_bed;
        this.wifi = wifi;
        this.duration = duration ;
      }
      public int cost ()
      {

          if (room_bed.equals("1")){ money += 500;}
          else if (room_bed.equals("2")){ money += 700;}
          else if (room_bed.equals("3")){ money += 1000;}
          else if (room_bed.equals("4")){ money += 1400;}

          if (wifi.equals("1")){money += 100;}

          money = money * duration ;

          return money;
      }

    
    
}
