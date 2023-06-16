import java.util.*;

public class Arbol {
    public Nodo raiz;
    private Map<Long, Nodo> valorList;

    public Arbol() {
        this.raiz = null;
        this.valorList = new HashMap<>();
    }

    public void agregarDato(long dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo padre = null;
            Nodo actual = raiz;

            while (actual != null) {
                padre = actual;

                if (dato < actual.dato) {
                    actual = actual.izquierdo;
                } else {
                    actual = actual.derecho;
                }
            }

            if (dato < padre.dato) {
                padre.izquierdo = nuevo;
            } else {
                padre.derecho = nuevo;
            }
        }
    }

    public boolean buscar(long valor) {

        return buscarNodo(raiz, valor);
    }
    private boolean buscarNodo(Nodo nodo, long valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.dato) {
            return true;
        } else if (valor < nodo.dato) {
            return buscarNodo(nodo.izquierdo, valor);
        } else {
            return buscarNodo(nodo.derecho, valor);
        }
    }

    public void recorridoEnOrden() {
        recorridoEnOrden(raiz);
        System.out.println();
    }

    private void recorridoEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            recorridoEnOrden(nodo.derecho);
        }
    }

    public void recorridoPosOrden() {
        recorridoPosOrden(raiz);
        System.out.println();
    }

    public void recorridoPosOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPosOrden(nodo.izquierdo);
            recorridoPosOrden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    public void recorridoPreOrden() {
        recorridoPreOrden(raiz);
        System.out.println();
    }

    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);
        }
    }
    public void mostrarArbol(Nodo nodo, String prefijo) {
        if (nodo != null) {
            if (nodo.derecho != null) {
                System.out.println(prefijo + "Nodo derecho:");
                mostrarValores(nodo.derecho, prefijo + "  ");
                System.out.println();
            }

            if (nodo.izquierdo != null) {
                System.out.println(prefijo + "Nodo izquierdo:");
                mostrarValores(nodo.izquierdo, prefijo + "  ");
                System.out.println();
            }
        }
    }

    private void mostrarValores(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.print(prefijo + nodo.dato + " ");
            mostrarValores(nodo.izquierdo, prefijo);
            mostrarValores(nodo.derecho, prefijo);
        }
    }
}
