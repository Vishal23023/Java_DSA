import java.util.*;

public class problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //12345
        int sum=0;

        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
