public class PrecedenciaEnOperadoresLogicos {
    public static void main(String[] args) {
        int a=7, b=5;
        boolean mentira = false;
        boolean r1= (a<b|| a==b)|| (mentira== true);
        System.out.println(r1);
        boolean r2 = ((a>b && mentira== true) ||(a==b && a<b)) && (mentira == false);
        System.out.println(r2);


    }
}
