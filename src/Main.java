import java.util.Scanner;
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("-------------------------");
    System.out.println("--PORTFOLIO OF ACTIVITY--");
    System.out.println("NAME: FABRO,JHANDENVER H.");
    System.out.println("SECTION AND YEAR: IT2G");
    System.out.println("---------CONTENT---------");
    System.out.println("1. Activity 1");
    System.out.println("-------------------------");
    System.out.println("Enter Selection");
    int select = sc.nextInt();
    System.out.println("-------------------------");

        if(select == 1){
            activity1 act1 = new activity1();
            act1.userGreetigs();
        }else{
            System.out.println("Selection Not Found!");
        }
}
