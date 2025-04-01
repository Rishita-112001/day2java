import java.util.*;

public class problem1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int i = sc.nextInt();
        String G = (i>=80) ? "A+":(i>=60)?"B+":"FAIL";
        System.out.println(G);

    }

}
