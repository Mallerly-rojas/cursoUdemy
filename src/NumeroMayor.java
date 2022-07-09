import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrse el primer numero");
        int a= entrada.nextInt();
        System.out.println("Ingrse el segundo numero");
        int b= entrada.nextInt();
        System.out.println("Ingrse el tercer numero");
        int c= entrada.nextInt();

        int max;
        max=(a>b)? a:b;
        max=(max>c)? max:c;
        System.out.println(" El maximo entre los tres numeros es " + max);

    }
}
