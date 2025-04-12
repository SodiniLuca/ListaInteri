

public class ListaInteri{
    // Attributo
    private Nodo head;

    // Costruttore
    public ListaInteri(){
        this.head = null;
    }

    /**
     * restituisce la testa della lista
     * @param nodo
     * @return true se il nodo è presente nella lista, false altrimenti
     */
    public boolean isEmpty(){
        return this.head == null;
    }

    /**
     * aggiunge un nodo alla testa della lista
     * @param nodo
     */
    public void addInTesta(Nodo nodo){
        nodo.setLink(head);
        head = nodo;
    }

    /**
     * aggiunge un nodo alla testa della lista
     * @param intero
     */
    public void addInTesta(Integer intero){
        Nodo p = new Nodo(intero);
        p.link = head;
        head = p;
    }

    /**
     * aggiunge un nodo in coda alla lista
     * @param nodo
     */
    public void addInCoda(Nodo nodo) {
        nodo.setLink(null);
        if (this.head == null) {
            this.head = nodo;
        } else {
            Nodo p = this.head;
            while (p.link != null) {
                p = p.link;
            }
            p.link = nodo;
        }
    }

    /**
     * restituisce la lunghezza della lista
     * @return lunghezza della lista
     */
    public int size() {
        // Contatore
        int c = 0;
        Nodo p = this.head;
        while (p != null) {
            c++;
            p = p.link;
        }
        return c;
    }

    /**
     * stampa la lista per interoperabilità
     * @return stringa con i valori della lista
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Lista (" + this.size() + " elementi):\n");
        Nodo p = this.head;
        while (p != null) {
            s.append("|" + p.toString() + "|-->");
            p = p.link;
        }
        s.append("|null|\n");
        return s.toString();
    }

    /**
     * popola la lista con i numeri da 1 a n
     * @param n
     */
    public void popola(int n) {
        if(n < 1) {
            System.out.println("Il numero deve essere maggiore di 0\n");
            return;
        }
        else{
            if(!(this.isEmpty())){
                this.head = null; // svuota la lista
            }
            for (int i = 1; i <= n; i++) {
                this.addInCoda(new Nodo(i));
            }
        }
    }

    /**
     * popola la lista con i numeri da n a 1
     * @param n
     */
    public void popolaInverso(int n) {
        if(n < 1) {
            System.out.println("Il numero deve essere maggiore di 0\n");
        }
        else{
            if(!(this.isEmpty())){
                this.head = null; // svuota la lista
            }
            for (int i = n; i >= 1; i--) {
                this.addInCoda(new Nodo(i));
            }
        }

    }
}