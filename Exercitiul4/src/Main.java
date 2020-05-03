public class Main {
    //Exercitiul
    //Se da un text
    //A.sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caracterul 'i' si caracterul 'i' se afla pe o pozitie para
    //Matei

    public static void main(String[] args) {

        String text = "Obiectul isotrieri nu se limiteaza doar la evenimentele politice, cum ar fi de exemplu bataliile sau faptele conducatorilor";
        int numarCuvinte=numereCuvinte(text);
        System.out.println("Numarul de cuvinte este: "+numarCuvinte);


    }

    public static int numereCuvinte(String text) {
        int numarCuvinte = 0;
        //luam fiecare cuvant si folosim ca despartitor spatiul
        String[] cuvinte = text.split(" ");
        for (int cursor = 0; cursor < cuvinte.length; cursor++) {
            //verificam dare are lungimea mai mare decat 2,daca are litera 'i'
            //vad daca pozitia lui i este para.se face cu indexOf si modulo %
            if (cuvinte[cursor].length() > 2 && cuvinte[cursor].contains("i") && cuvinte[cursor].indexOf("i") % 2 == 0) {
                numarCuvinte++;

            }
        }
        return numarCuvinte;
    }
}