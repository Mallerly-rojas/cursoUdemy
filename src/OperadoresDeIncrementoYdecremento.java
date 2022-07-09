public class OperadoresDeIncrementoYdecremento {
    public static void main(String[] args) {
        //incremento y decremento
        int a = 5;
        //incremento en uno ny liego devuelve el numero
        a=5;
        int b=++a;
        System.out.println(b);

        //devuelve el numero y luego incrementa en uno
        a=5;
        int c= a++;
        System.out.println(c);
        System.out.println(a);

        //decrementa en uno y luego devuelve el numero
        a=5;
        int d=--a;
        System.out.println(d);

        //devuelve el numero y luego decrementa en uno
        a=5;
        int e= a--;
        System.out.println(e);
        System.out.println(a);
    }
}
