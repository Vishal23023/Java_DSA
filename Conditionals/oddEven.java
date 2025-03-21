import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();

        //If else statement
        // if(a%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        //Ternary Operator
        String ans;
        ans=(a%2==0)? "Even":"odd";
        System.out.println(ans);
    }
}