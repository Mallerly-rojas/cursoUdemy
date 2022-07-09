import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        String usuario = "mallerly";
        String contraseña= "123456";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrse un nombre de usuario");
        String U = entrada.nextLine();
        System.out.println("introduce tu contraceña");
        String P = entrada.nextLine();


        if (usuario.equals(U)&&contraseña.equals(P)){
            System.out.println("datos autenticados, bienvenida");
        }else{
            System.out.println("error intente de nuevo");
        }


    }
}
