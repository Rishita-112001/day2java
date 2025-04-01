import java.util.*;

public class factorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i>=1; i--){
            fact *= i ;
        }
        System.out.println(fact);
    }
}
