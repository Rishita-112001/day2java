public class p2 {
    public static void main(String []args){
        int a = 23;
        int b = 45;
        int c = 34;
        String G=(a>b&&a>c)?"a is greater":(b>a&&b>c)?"b is greater":"c is greater";
        System.out.println(G);
    }
}
