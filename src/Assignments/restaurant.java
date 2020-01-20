package Assignments;

public class restaurant {
    private String name;
    private int guestCapacity;
    private int guestCount;


    public void isAvailableSeats(){

        if(guestCount > guestCapacity){
            System.out.println("No more seats are available.");
        }
        else{
            System.out.println("Yes, seats available.");

        }
    }

    public void removesParty(int guestsLeaving){
        int availableSeats = guestsLeaving;
        System.out.println(availableSeats + " seats are open.");
    }



    public void restaurantName(String name){
        this.name = name;


    }

    public void getGuestCapacity(int guestCapacity){
        this.guestCapacity = guestCapacity;
    }
    public void getGuestCount(int guestCount){
        this.guestCount = guestCount;

    }

    public void openForService(String name, int guestCapacity){
        this.name = name;
        this.guestCapacity = guestCapacity;
        System.out.println(name + " is open for a maximum party of " + guestCapacity);
    }


    public void restaurantSummary(){
        System.out.println("Restaurant name: " + name);
        System.out.println(guestCapacity + " total seating capacity");
        System.out.println(guestCount + " total guests");
    }
}
