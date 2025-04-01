import java.util.*;

public class sumOfNumbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = sc.nextInt();
        int sum=0;
        while(i<=num){
            if (i % 2 == 0) {
                sum +=i;
            }
            i++;
        }
    }
}
