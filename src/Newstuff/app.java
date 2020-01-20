package Newstuff;

public class app {
    public static void main(String[] args) {

        User user = new User();
        //user.getSummary();
        System.out.println(user.getBalance());
        user.setDetails("Mike", 40);
        user.setIncome(50000);
        user.setIncome(40000);
        user.setExpense(10000);
        user.setExpense(20000);
        System.out.println(user.getBalance());
        user.getSummary();
        user.resetBalance();
        user.getSummary();


    }
}
