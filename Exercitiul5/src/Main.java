public class Main {

    //Se da un text
    //Sa se afiseze toate cuvintele care incep cu litera 's' SAU cu litera 'd'
    //Apoi sa se afiseze litera de la pozitia 3 din fiecare cuvant

    public static void main(String[] args) {

        String text = "Spre deosebire de povestirea fictionala, specia de povestire numita istorie nu este construita prin intuitie intelecuala, ci pornind de la surse";

        afisareCuvinte(text);
        literaPozitie3(text);
    }

    public static void afisareCuvinte(String text) {
        String[] sirText = text.split(" ");
        for (int cursor = 0; cursor < sirText.length; cursor++) {
            //Transformam literele mari in litere mici cu .toLowerCase
            sirText[cursor] = sirText[cursor].toLowerCase();
            if (sirText[cursor].startsWith("s") || sirText[cursor].startsWith("d")) {
                System.out.println(sirText[cursor]);
            }
        }

    }

    public static void literaPozitie3(String text) {
        //despartim cuvintele prin spatiu
        String[] sirText = text.split(" ");
        for (int cursor = 0; cursor < sirText.length; cursor++) {
            //luam cuvintele care sunt mai mari de 3
            if (sirText[cursor].length() > 3) {
                System.out.println("Caracterul de pe pozitia 3 a cuvantului: " + sirText[cursor] + "este: " + sirText[cursor].charAt(3));

            }
        }


    }
}
