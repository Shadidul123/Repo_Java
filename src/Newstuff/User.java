package Newstuff;

public class User {
    private String name;
    private int age;
    private double income;
    private double expense;

    public void getSummary(){
        System.out.println("name: "+name);
        System.out.println("age " +age);
        System.out.println("income "+income);
        System.out.println("expense "+expense);
    }

    public double getBalance(){
        return income - expense;
    }

    public void setDetails(String name,int age ){
        this.name = name;
        this.age = age;
    }
    public void setIncome(double income){
        this.income += income;
    }
    public void setExpense(double expense){
        this.expense = this.expense + expense;
    }

    public void resetBalance(){
        income = 0;
        expense = 0;
    }

}
