/**
 * Created by Camilo on 05/06/2018.
 */
public class OperacionAritmeth {
    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        int suma1,multiplicacion1,resta1;
        suma1= OperacionAritmeth.suma(a, b);
        multiplicacion1= OperacionAritmeth.multiplicacion(a, b);
        resta1= OperacionAritmeth.resta(a, b);
        System.out.print("la suma es:");
        System.out.print(suma1);
    }

    public static int suma(int a, int b){
        return a+b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }

    public static int resta(int a,int b){
    return a-b;
    }

    }

