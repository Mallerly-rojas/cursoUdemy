import javax.swing.*;

public class entradaDatos {
    public static void main(String[] args) {
       String numero= JOptionPane.showInputDialog("Ingresa un numero entero");
      int  numeroreal= Integer.parseInt(numero);
        System.out.println("nuestro numero es " + numeroreal);
        String numeroBinario= Integer.toBinaryString(numeroreal);
        System.out.println("numero en binario " + numeroBinario);
        System.out.println(" numero en hexagesimal "+ Integer.toHexString(numeroreal));
        System.out.println(" numero en octal  " + Integer.toOctalString(numeroreal));

        String resultados= "nuestro numero es " + numeroreal + "\nnumero en binario " + numeroBinario + "\n numero en hexagesimal "+ Integer.toHexString(numeroreal) + " \nnumero en octal  " + Integer.toOctalString(numeroreal);
        JOptionPane.showMessageDialog(null, resultados);

    }

}
