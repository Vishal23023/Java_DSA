import java.util.*;

public class nNaturalNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Using while loop
        int n=sc.nextInt();
        int num=1;

        //print n natural numbers 
        while(num<=n){
            System.out.println(num);
            num++; 
        }

        //Print sum of n natural numbers
        int sum=0;
        while(num<=n){
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
} 