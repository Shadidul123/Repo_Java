package Newstuff;

public class print {
    private int tonerLevel;  //using 100 as example
    private int numberOfPages; //using 100 as example
    private boolean isSingleSided;
    private boolean isDoubleSided;


    //user setting the toner level
    public void setTonerLevel(int tonerLevel) {
            this.tonerLevel = tonerLevel;
    }

    // user setting the number of pages
    public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
    }

    //example toner = 100. printed page = 20. updated toner = 80;
    //toner= toner -printed page = 100-80=20
    //page = page - printed page = 100-80=20

    public void getStatusSinglePagedPrint(int numberOfPages, boolean isSingleSided) {
        if(this.numberOfPages <= 100 && tonerLevel <= 100)
        {
            this.numberOfPages = this.numberOfPages - numberOfPages;
            this.isSingleSided = isSingleSided;
            tonerLevel -= numberOfPages;
            System.out.println("Toner Level Remaining: " + tonerLevel);
            System.out.println("Number of pages remaining: " + this.numberOfPages);

        }
        else
            System.out.println("Error: Invalid toner level and/or number of pages.");
    }

    public void getStatusDoublePagedPrint ( int numberOfPages, boolean isDoubleSided) {
        if (this.numberOfPages <= 100 && tonerLevel <= 100)
        {
            this.isDoubleSided = isDoubleSided;
            this.numberOfPages -= numberOfPages;     //100-20=80
            tonerLevel -= numberOfPages * 2; // 100-(20*2) = 60
            System.out.println("Toner Level Remaining: " + tonerLevel);
            System.out.println("Number of pages remaining: " + this.numberOfPages);
        }
        else
            System.out.println("Error: Invalid toner level and/or number of pages.");
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public void checkLowToner(){
        if(tonerLevel<1)
            System.out.println("Low toner level, please add soon.");
        else if(tonerLevel<=100)
            System.out.println("Sufficient ink available.");
        else
            System.out.println("Invalid toner level");
    }


}















