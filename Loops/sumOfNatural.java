import java.util.*;

public class sumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Using for loop
        int n=sc.nextInt();

        //n natural numbers
        for(int num=1;num<=n;num++){
            System.out.println(num );
        }

        //sum of n natural numbers
        int sum=0;
        for(int num=1;num<=n;num++){
            sum+=num;
        }
        System.out.println(sum);

        //n natural numbers in backwards order
        for(int num=n;n>=1;num--){
            System.out.println(num);
        }
    }
}
