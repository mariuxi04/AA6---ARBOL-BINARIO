 class Nodo {
    public long dato;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(long dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodo ").append(dato);
        if (izquierdo != null) {
            sb.append("\n\tIzquierdo: ").append(izquierdo);
        }
        if (derecho != null) {
            sb.append("\n\tDerecho: ").append(derecho);
        }
        return sb.toString();
    }
}

