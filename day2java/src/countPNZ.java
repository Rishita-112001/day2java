import java.util.*;

public class countPNZ {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int p =0;
        int n = 0;
        int z = 0;
        Boolean G = true;
        do{
            System.out.println("Enter the number:");
            int i = sc.nextInt();
            if(i<0){
                n++;
            }
            else if(i>0){
                p++;
            }
            else if(i==0){
                z++;
            }
            System.out.println("Do you want to continue(yes:true,no:false");
             G = sc.nextBoolean();
        }while(G);
        System.out.println("Positive Numbers:"+p);
        System.out.println("Negative Numbers:"+n);
        System.out.println("ZERO :"+z);
    }
}
