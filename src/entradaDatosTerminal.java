import java.util.Scanner;

public class entradaDatosTerminal {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println(" introduce un numero entero");
        int  numeroreal= entrada.nextInt();
        System.out.println("nuestro numero es " + numeroreal);
        String numeroBinario= Integer.toBinaryString(numeroreal);
        System.out.println("numero en binario " + numeroBinario);
        System.out.println(" numero en hexagesimal "+ Integer.toHexString(numeroreal));
        System.out.println(" numero en octal  " + Integer.toOctalString(numeroreal));


    }
}
