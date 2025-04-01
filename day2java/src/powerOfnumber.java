import java.util.*;

public class powerOfnumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the power:");
        int b = sc.nextInt();
        int result = 1;
        for(int i =1; i<=b; i++){
            result *=a;
        }
        System.out.println(a+"^"+b+"="+result);
    }
}
