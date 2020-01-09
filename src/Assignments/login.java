package Assignments;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        // scanner

        Scanner userName = new Scanner(System.in);
        System.out.println("Enter username: ");
        String actualUserName = userName.nextLine();
        System.out.println(actualUserName);
        Scanner password = new Scanner(System.in);
        //tell user to enter password
        System.out.println("plz Enter password: ");
        //takes input from console and stores the value into actualPassword variable
        String actualPassword = password.nextLine();
        //System.out.println(actualPassword);
        String expectedUserName = "Bob123";
        String expectedPassword = "technoSoft123";

        //int count = 5; //max#oftries subtract by 1 each time the password is wrong
        for (int i = 0; i < 5; i++) {  //doing this 5 times
            if (!actualUserName.equals(expectedUserName) || !actualPassword.equals(expectedPassword)) {  //subtract by 1 each time the password is wrong
                int count = 5 - i;   //first try is i = 0, second try i =1
                System.out.println("Please enter valid Username");
                System.out.println("Please enter valid password");
                System.out.println("# of attempts remaining: " + count);
                actualUserName = userName.nextLine();
                actualPassword = password.nextLine();

                if (i == 4) {            //(i = 4) is the 5th and last try
                    System.out.println("Account locked for 10 minutes");
                }
            } else {
                System.out.println("Welcome User");
                break;

            }
        }
    }
}