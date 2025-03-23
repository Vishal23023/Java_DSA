import java.util.*;

public class problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This program reverse the given number
        int n = sc.nextInt();
        int ans=0;

        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.println(ans);
    }
}
