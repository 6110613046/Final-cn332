public class Client
{
    String name;
    String address;
    String phone;
    String password;
    Account account;
    HotelFactory hotel;

    public Client(String name, String address, String phone, String password)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }
    public void setClientRoom(HotelFactory c)
    {
        hotel = c;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }
    
    
    public void view(){
        System.out.println("name : "+name);
        System.out.println("address : "+address);
        System.out.println("phone : "+phone);
        System.out.println("passwoed : "+password);
       
    }
    
}
