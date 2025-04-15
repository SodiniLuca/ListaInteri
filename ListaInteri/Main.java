import java.util.Scanner;

public class Main{

    final static Scanner scanner = new Scanner(System.in);

    /**
     * mostra il menu e restituisce la scelta dell'utente
     * @return scelta dell'utente
     */
    private static String menu(){
        System.out.println("---------- Menu ----------\n" +
                "1. Aggiungi un numero in testa alla lista\n" +
                "2. Aggiungi un numero in coda alla lista\n" +
                "3. Stampa la lista\n" +
                "4. Stampa la lunghezza della lista\n" +
                "5. La lista e' vuota?\n" +
                "6. Popola la lista con i numeri da 1 a n\n" +
                "7. Popola la lista con i numeri da n a 1\n" +
                "8. Ordina crescente\n" +
                "0. Esci");
        System.out.print("Scegli un'opzione: ");
        return scanner.nextLine();
    }
    /**
     * main del programma
     * @param args
     */
    public static void main(String[] args) {
        ListaInteri numeri = new ListaInteri();
        String scelta = "-1";
        while(!(scelta.equals("0"))){
            scelta = menu();
            switch (scelta) {
                case "1":
                    System.out.print("Inserisci un numero: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere di nuova linea
                    numeri.addInTesta(new Nodo(numero));
                    break;
                case "2":
                    System.out.print("Inserisci un numero: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere di nuova linea
                    numeri.addInCoda(new Nodo(numero));
                    break;
                case "3":
                    System.out.println(numeri.toString());
                    break;
                case "4":
                    System.out.println("Lunghezza della lista: " + numeri.size() + "\n");
                    break;
                case "5":
                    if(numeri.isEmpty()){
                        System.out.println("Si, la lista e' vuota\n");
                    }else{
                        System.out.println("No, la lista non e' vuota\n");
                    }
                    break;
                case "6":
                    System.out.print("Inserisci un numero: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere di nuova linea
                    numeri.popola(n);
                    break;
                case "7":
                    System.out.print("Inserisci un numero: ");
                    n = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere di nuova linea
                    numeri.popolaInverso(n);
                    break;
                case "8": 
                    numeri.ordinaCrescente();
                    break;
                default:
                    if(!(scelta.equals("0"))){
                        // Se l'input non è 0 e non è valido, mostra un messaggio di errore
                        System.out.println("Opzione non valida\n");
                        break;
                    }
            }
        }
    }
}



