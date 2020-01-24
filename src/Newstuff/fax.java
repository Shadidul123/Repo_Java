package Newstuff;

public class fax {
    public static void main(String[] args) {

        String month ="April";

        switch(month){
            case "Dec":
            case "jan":
            case "Feb":
                System.out.println("winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "Augst":
                System.out.println("Summer");
                break;
            case "Sept":
            case "Oct":
            case "Nov":
                System.out.println("Fall");
                break;

            default:
                System.out.println("fuck you");



        }
    }




}
