public class Calculator {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 2;
        char option = '+';

        //wersja z wieloma wyświetleniami:
        /*
        switch(option) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
                */

        //wersja z jednym wyświetlniem:
        double result = 0;
        switch(option) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
        }
        System.out.println(result);

    }
}







