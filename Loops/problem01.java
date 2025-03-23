import java.util.*;

public class problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int sample_n=n;
        int counter=0;

        while(sample_n>0){
            sample_n/=10;
            counter++;
        }
        System.out.println(counter);
    }
}
