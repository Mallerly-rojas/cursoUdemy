import java.util.Locale;

public class metodosImportantes1 {
    public static void main(String[] args) {
        String nombre= "Mallerly";
        System.out.println(nombre.toUpperCase(Locale.ROOT));
        System.out.println(nombre.toLowerCase(Locale.ROOT) );
        System.out.println(nombre.equals("mallerly"));
        System.out.println(nombre.equalsIgnoreCase("Mallerly"));
        System.out.println(nombre.compareTo("juan"));
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(nombre.length()-1));
        //metodos importantes 2
        System.out.println(nombre.replace("M", "."));
        System.out.println(nombre.lastIndexOf('a'));
        System.out.println(nombre.indexOf("malle"));
        System.out.println(nombre.startsWith("lle"));
        System.out.println(nombre.startsWith("Ma"));
        System.out.println(nombre.endsWith("rly"));
        System.out.println(nombre.contains("lle"));
        System.out.println(nombre.trim());



    }
}
