package Assignments;

public class LOOPS {

    public static void main(String[] args) {

        String word = "civica";
        //reverse the word
        //if word = revsere -> plaindome , else not

        String reverse = "";

        char[] characters = word.toCharArray();

        for (int i = characters.length -1; i>=0; i-- ){
            reverse = reverse + characters[i];
        }


        if (reverse.equals(word))
            System.out.println("yes, palindrome");
        else
            System.out.println("Not a palindrome");










    }
}
