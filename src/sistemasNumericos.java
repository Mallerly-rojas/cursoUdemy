public class sistemasNumericos {
    public static void main(String[] args) {
        int numero =450;
        System.out.println("nuestro numero es " + numero);

        String numeroBinario= Integer.toBinaryString(numero);
        // 0b prefijo para binario
        System.out.println("numero en binario " + numeroBinario);
        System.out.println(" numero en binario escrito en java "+ 0b111000010);
        // 0x prefijo hexagesimal
        System.out.println(" numero en hexagesimal "+ Integer.toHexString(numero));
        System.out.println("numero en hexagesimal escrito en java "+ 0x1c2);
        // 0 prefijo para octal
        System.out.println(" numero en octal "+ Integer.toOctalString(numero));
        System.out.println("numero en octal escrito en java "+ 0702 );
    }
}
