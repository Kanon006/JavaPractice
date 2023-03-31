package StudyEasy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner sc=new Scanner(System.in);
        String name =sc.next();
        System.out.println("Hey There,"+name+".Have a Nice Day.");
        System.out.println(".\n.\n.\n.\n");
        System.out.println("What is your Age ?");
        int age=sc.nextInt();
        System.out.println("Your Age Is "+age+".");
        System.out.println("\n");
        System.out.println("Hey,"+name+".Your Age Is "+age+".");
        System.out.println("\n");
        System.out.println("Do you have any queries about me ?");
        String queries=sc.next();
        if(queries.equals("no")){

        System.out.println("OK you have "+queries+" queries,Thanks to being with us.");
        }

        else if(queries.equals("yes")) {
            System.out.println("OK,LETS TALK");
        }

        else {
            System.out.println("SORRY, plz enter correct form,plz type YES or NO");
        }
//        if(queries.equalsIgnoreCase("yes"+"||"+"no")){
//            System.out.println("Plz try again");
//        }
//        if(queries !="no"){
//            System.out.println("sry");
//
//        }


    }
}
