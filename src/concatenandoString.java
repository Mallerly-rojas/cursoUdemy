public class concatenandoString {
    public static void main(String[] args) {
        String saludo="Hola, gracias por la informacion ";
        String Nombre= "Mallerly";
        String Nombre1= "Mallerly";
        String saludoPersonalizado= saludo + Nombre;
        String saludoPersonalizado2=saludo.concat(Nombre);
        System.out.println(saludoPersonalizado);
        System.out.println(saludoPersonalizado2);


//otra forma de concatenar:
        saludo= saludo.transform(s -> {
            return s + Nombre;
        });
        System.out.println(saludo);
        Nombre1= Nombre1.replace("a", "A");
        System.out.println(Nombre1);

    }
}
