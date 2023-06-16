import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESAR VALORES PARA EL ARBOL: ");
        String valoresInput = scanner.nextLine().trim();

        String[] valores = valoresInput.split(" ");
        for (String valor : valores) {
            arbol.agregarDato(Long.parseLong(valor));
        }

        System.out.println("R. ORDDEN:");
        arbol.recorridoEnOrden();
        System.out.println("R. POS-ORDEN:");
        arbol.recorridoPosOrden();
        System.out.println("R. PRE-ORDEN:");
        arbol.recorridoPreOrden();
        arbol.mostrarArbol(arbol.raiz, "");

    }
}
