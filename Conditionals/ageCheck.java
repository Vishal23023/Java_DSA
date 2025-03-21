import java.util.Scanner;

public class ageCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        // Else if statement
        if(age<=12){
        System.out.println("Child");
        }
        else if(age>12 && age<18){
        System.out.println("Teenage");
        }
        else{
        System.out.println("Adult");
        }

        // Nested else if statement
        if (age <= 12) {
            if (age <= 5) {
                System.out.println("Toddler");
            } else {
                System.out.println("Child");
            }
        } else if (age > 12 && age < 18) {
            System.out.println("Teenage");
        } else {
            System.out.println("Adult");
        }
    }
}
