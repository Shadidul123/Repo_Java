package Newstuff;

public class setup {

    public static void main(String[] args) {
        printer HP = new printer();


        HP.setTonerLevel(25);
        HP.setTonerLevel(1);
        HP.checkTonerMax();
        HP.printerSummary();




    }
}
