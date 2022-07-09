import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrse su calificacion");
        double U= entrada.nextDouble();


        if (U>=6){
            System.out.println("aprobada");
        }else{
            System.out.println("reprobado");
        }


    }
    }

