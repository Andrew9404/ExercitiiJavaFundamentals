public class Main {

    //Exercitiu
    //Dintr-un vector(array) care e numarul cel mai mare
    //Avem un vector de 10 elemente int, returnam cel mai mare numar


    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 30;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        array[9] = 9;

        int valoare=celMaiMareNumar(array);
        System.out.println("Cel mai mare numar este: "+ valoare);



    }

    public static int celMaiMareNumar(int[] array) {

        int celMaiMareNumar = array[0];
        //Cum treci prin ficare vector?cu FOR
        //Cum se cheama cel care trecem prin fiecare element? CURSOR
        //cursor = 0 de unde incepe , cursor array.length sa vedem lungimea

        for (int cursor = 0; cursor < array.length; cursor++) {

            if (array[cursor] > celMaiMareNumar){
                celMaiMareNumar=array[cursor];
            }
        }
        return celMaiMareNumar;

    }


}
