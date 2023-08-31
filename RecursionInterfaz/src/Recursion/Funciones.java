package Recursion;


public class Funciones {
    
    // Suma de número en serie n 
    static int sum(int n) {
        if (n == 1) {
            return n;
        }
        else {
            return n + sum(n-1);
        }
    }
    
    
    // Factorial de n
    static double fact(double n) {
        if (n == 1) {
            return n;
        }
        else {
            return n * fact(n - 1);
        }
    }
    
    
    // Potencia n a la m
    static double pow(double n, double m) {
        if (m == 1) {
            return n;
        }
        else {
            return n * pow(n, m-1);
        }
    }
    
    
    // Fibonacci
    static void fibonacci(double[] array, int index) {
        if (array[array.length - 1] == 0) {
            if (array[0] == 0) {
                array[0] = 1;
                if(array.length > 1) {
                    array[1] = 1;
                    fibonacci(array, 2);
                }
            }
            else {
                array[index] = array[index-1] + array[index-2];
                fibonacci(array, index + 1);
            }
        }
    }
    
    
    // Fibonacci to String
    static void sFibonacci(String[] s, double[] array, int index) {
        
        if (array.length - 1 != index) {
            s[0] = s[0] + String.format("%.0f, ", array[index]);
            sFibonacci(s, array, index + 1);
        }
        else {
            s[0] = s[0] + String.format("%.0f", array[index]);
        }
    }
    
    
    // Máximo Común Divisor de n y m
    public static int mcd(int n,int m) {
        if (m == 0) {
            return n;
        }
        else {
            return mcd(m,n%m);
        }
    }
    
}
