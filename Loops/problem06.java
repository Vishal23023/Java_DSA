import java.util.*;

public class problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans=1;
        while(b>0){
            ans=ans*a;
            b--;
        }
        System.out.println(ans);
    }
}
