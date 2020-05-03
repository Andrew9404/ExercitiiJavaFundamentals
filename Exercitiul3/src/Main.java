public class Main {
    //Exercitiul
    //Se da un text,sa se numere cuvintele care au lungimea impara si se termina cu litera 'e'

    public static void main(String[] args) {

        String text = "Istoria este stiinta care studiaza evolutia societatii omenesti din trecut pana in prezent";

        int variabila = numarCuvinte(text);
        System.out.println("Numarul de cuvinte gasite: " + variabila);


    }

    public static int numarCuvinte(String text) {

        int numarCuvinte = 0;
        String[] rezultatSplit = text.split("");
        for (int cursor = 0; cursor < rezultatSplit.length; cursor++) {


            //!= asta inseamna DIFERIT DE 0
            if (rezultatSplit[cursor].length() % 2 != 0 && rezultatSplit[cursor].endsWith("e")) {
                numarCuvinte++;
            }

        }
        return numarCuvinte;

    }
}
