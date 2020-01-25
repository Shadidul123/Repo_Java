package Newstuff;

public class p11 {
    public static void main(String[] args) {
        print printer = new print();

        printer.setTonerLevel(100);
        printer.setNumberOfPages(100);
        printer.getStatusDoublePagedPrint(20,true);


    }
}
