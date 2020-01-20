package Newstuff;

public class txt {
    public static void main(String[] args) {
        restaurant r1 = new restaurant();
        r1.setGuestCapacity(20);
        r1.setGuestCount(5);
        r1.setGuestCount(2);
        System.out.println(r1.currentGuestCount());
        r1.setDetails("Fogo de Chao", 20);
        r1.restaurantSummary();





    }
}
