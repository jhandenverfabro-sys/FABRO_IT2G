import java.util.Scanner;
public class activity1 {

    public void userGreetigs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int byear = sc.nextInt();
        System.out.println("--------------------------");
        System.out.println("Welcome Mr." + name);
        System.out.println("Your are " + (2026 - byear) + " years old");
        System.out.println("--------------------------");
    }
}
