package Newstuff;

public class restaurant {
    private String name;
    private int guestCapacity;
    private int guestCount;

    public void setGuestCapacity(int guestCapacity){
        this.guestCapacity = guestCapacity;
    }

    public void setGuestCount(int guestCount){
        this.guestCount = this.guestCount + guestCount;
    }

    public int currentGuestCount(){
        return guestCount;

    }

    public void seatsAvailable(){
        if (guestCount <= guestCapacity)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public void seatsParty(int partyOf){
        guestCapacity = guestCapacity - guestCount - partyOf;
        if (guestCapacity < 0)
            System.out.println("cannot seat party");
        else
            System.out.println("Party of " + partyOf + " accepted.");

        System.out.println(guestCapacity);
    }
    public void removesParty(int removalParty){
        //removing party will increase guest capacity
        guestCapacity = guestCapacity - guestCount + removalParty;
        System.out.println(guestCapacity);

    }

    public void setDetails(String name, int guestCapacity){
        this.name = name;
        this.guestCapacity = guestCapacity;
        System.out.println("Name: " + name);
        System.out.println("Guest capacity: "+ guestCapacity);
    }

    public void restaurantSummary(){
        System.out.println(this.name);
        System.out.println(this.guestCapacity);
        System.out.println(this.guestCount);
    }




}




