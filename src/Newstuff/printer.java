package Newstuff;




public class printer {
    private int tonerLevel;
    private int numPages;
   // private int oneSided;
   // private int doubleSided;


    public void printSingleSided(int numPages){


    }


    //set toner level
    public void setTonerLevel(int tonerLevel){
        this.tonerLevel = this.tonerLevel + tonerLevel;
    }
    //check if toner level is above 100
    public void checkTonerMax(){
        if (tonerLevel > 100){
            System.out.println("Error toner level cannot exceed 100");
        }
    }

    //set numPages

    public void setNumPages(int numPages){
        this.numPages += numPages;
    }

    // error if over 100 pages
    public void isOver100(){
        if(numPages > 100){
            System.out.println("Error number of pages cannot exceed 100");
        }
    }

    //get toner level at any time
    public int getTonerLevel(){
        return tonerLevel;
    }

    //checks to see if ink is low
    public void checkInkLevel() {
        if (tonerLevel < 1)
            System.out.println("Low Toner, Please add more toner.");
    }

    public void numPagesPrinted(int numPages){
        this.numPages += numPages;
    }

    public void printerSummary(){
        System.out.println("number of pages: " +numPages);
        System.out.println("toner level: "+tonerLevel);
    }






}
