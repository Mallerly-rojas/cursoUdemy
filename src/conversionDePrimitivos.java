public class conversionDePrimitivos {
    public static void main(String[] args) {
        boolean cierto= true;
        String ciertoConvertido= Boolean.toString(cierto);
        int entero=5687;
        String enteroConvertido= Integer.toString(entero);
        float flotante= 2.56e2f;
        String flotanteConvertido=Float.toString(flotante);
        double decimal= 23.673;
        String decimalConvertido= Double.toString(decimal);

        String mensaje= ciertoConvertido +"\n" + flotanteConvertido +"\n" + enteroConvertido +"\n " + decimalConvertido;
        System.out.println(mensaje);

    }
}
