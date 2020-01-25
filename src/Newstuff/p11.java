package Newstuff;

public class p11 {
    public static void main(String[] args) {
        print printer = new print();

        printer.setTonerLevel(1000);
        printer.setNumberOfPages(90);
        printer.getStatusSinglePagedPrint(20,true);
        System.out.println(printer.getTonerLevel());
        printer.checkLowToner();


    }
}
