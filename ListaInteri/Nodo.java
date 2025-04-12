public class Nodo {
    // Attributi
    public Integer info;
    public Nodo link;

    // Costruttore
    public Nodo(Integer intero){
        this.info = intero;
        this.link = null;
    }

    /**
     * modifica il valore del nodo
     * @param intero
     */
    public void setInfo(Integer intero){
        this.info = intero;
    }

    /**
     * modifica il link del nodo
     * @param link
     */
    public void setLink(Nodo link){
        this.link = link;
    }

    /**
     * restituisce il valore del nodo
     * @return info
     */
    public Integer getInfo(){
        return this.info;
    }

    /**
     * restituisce il link del nodo
     * @return link
     */
    public Nodo getLink(){
        return this.link;
    }

    /**
     * restituisce una stringa con il valore del nodo
     * @return Stringa con il valore del nodo
     */
    public String toString(){
        return "" + this.info;
    }
}