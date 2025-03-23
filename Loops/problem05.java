import java.util.*;

public class problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Find the factorial
        int n = sc.nextInt();
        int fact=1;

        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
