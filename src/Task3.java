import java.util.Scanner;


public class Task3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("First name:");
        String s1 = scn.nextLine();
        System.out.println("Last name:");
        String s2 = scn.nextLine();
        System.out.println("Telephone number:");
        String s3 = scn.nextLine();
        System.out.println("Adress:");
        String s4 = scn.nextLine();
        System.out.println("First name:" + s1);
        System.out.println("Last name:" + s2);
        System.out.println("Telephone number:" + s3);
        System.out.println("Adress:" + s4);

    }
}