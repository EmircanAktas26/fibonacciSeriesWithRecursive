import java.util.Scanner;

/*
*@Author Emircan Aktas - 29.Dec.2022
 */
public class Main {
    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}