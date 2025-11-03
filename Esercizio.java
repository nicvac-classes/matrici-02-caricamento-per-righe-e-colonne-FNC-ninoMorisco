public class Esercizio {

    public static void esercizio1() {
        int j=0;
        while(j<=4){
            m[1][j]=7;
            ++j
        }
        UtilsMatrice.visualizza(MiaMattrice);
    }

    public static void esercizio2() {
       int j;
       int[][] MiaMatrice=new int [3][5];
       j=0;
       while(j<=4){
        MiaMatrice[1][j]=7;
       }
       UtilsMatrice.visualizza(MiaMattrice);
    }

    public static void esercizio3() {
        int i;
        int[][] MiaMattrice = new int [3][5];
        i=0;
        while(i<=2){
            miaMatrice[i][3]=7;
        }
        UtilsMatrice.visualizza(MiaMattrice);
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("ESERCIZIO 1: ");
        System.out.println("----- ----- -----");
        esercizio1();

        System.out.println();
        System.out.println("ESERCIZIO 2: ");
        System.out.println("----- ----- -----");
        esercizio2();

        System.out.println();
        System.out.println("ESERCIZIO 3: ");
        System.out.println("----- ----- -----");
        esercizio3();
    }
}