import java.util.*;

public class basics02 {
    public static void main(String[] args) {
     
        //taking input in java
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your lucky number");

        //int input
        int num_1 = sc.nextInt();
        System.out.println("Lucky Number is: " + num_1);

        //single word input
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("My name is :" + name);

        //whole string as input
        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println("My name is :" + fullName);
    }
}
