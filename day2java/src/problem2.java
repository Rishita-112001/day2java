import java.util.*;

public class problem2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        int a = sc.nextInt();
        System.out.println("Enter second side of triangle:");
        int b = sc.nextInt();
        System.out.println("Enter third side of triangle:");
        int c = sc.nextInt();
        if(a==b&&b==c){
            System.out.println("Equilateral Triangle");
        }
        else if(a!=b&&b!=c){
            System.out.println("Scalar Triangle");
        }
        else if(a==b||b==c){
            System.out.println("Isosceles Triangle");
        }
    }
}
