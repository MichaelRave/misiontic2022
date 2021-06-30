import java.util.Scanner;

public class junio29b {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre= scanner.nextLine();
        System.out.println(saludar(nombre));
    }
    //estructura de una función (ejemplo con retorno float)
    /*public static float nombre_funcion(int variable){
    }*/

    public static String saludar(String nombre){
        return "Hola "+ nombre;
    }
}
