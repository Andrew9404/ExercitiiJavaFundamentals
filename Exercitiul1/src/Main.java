public class Main {

    //Exercitiu
    //O functie care primeste 2 Stringuri ca parametru si verifica daca al doilea string exista in primul string

    public static void main(String[] args) {

        String string1="Ana are pere de aceasta data";
        String string2="Ana are pere";
        verificaIncludere(string1,string2);

    }
    public static void verificaIncludere(String string1,String string2){

        if(string1.contains(string2)){
            System.out.println("Primul il contine pe al doilea");
        }else{
            System.out.println("Primul nu il contine pe al doilea");
        }
    }


}
