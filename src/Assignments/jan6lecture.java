package Assignments;

public class jan6lecture {

    public static void main(String[] args) {

        String[] names = {"Mo", "alex", "James"};

        for (String name:names){
            //System.out.println(name);
            boolean isJames = name.equalsIgnoreCase("James");
            if (isJames == true){
                System.out.println("James is here");
                break;
            }

         String [] months = {"Jan", "Feb", "Dec"};
            for (String month: months){
                boolean isDec = month.equalsIgnoreCase("Dec");
                if (isDec)
                    System.out.println("December is here");
                break;
                // boolean isDec (true iff) isDec = month.equalsignorecase..

            }


        }

    }
}
