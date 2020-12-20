public class SalaryChange {
    public static void main(String[] args) {
        //zapisanie pensji osoby
        int salary1 = 100;
        int salary2 = 2000;
        int salary3 = 2500;
        int raise1 = 1000;
        int raise2 = 200;
        int raise3 = 25;

        int salary = salary2;

        //wyświetlenie pensji:
        System.out.println(salary);


        // obliczenie podwyżki w zależności od wynagrodzenia
        //wersja z jednym wyświetleniem:
        int result = 0;

        switch (salary) {
            case 100:
                result = salary1 + raise1;
                break;
            case 2000:
                result = salary2 + raise2;
                break;
            case 2500:
                result = salary3 + raise3;
                break;
        }
        //wyświetlenie pensji po podwyżce:
        System.out.println(result);

        //oblicza i wyświetla o ile procent wzrosła pensja:

        int result1 = 0;
        switch (salary) {
            case 100:
                result1 = ((raise1*100)/salary1);
                break;
            case 2000:
                result1 = ((raise2*100)/salary2);
                break;
            case 2500:
                result1 = ((raise3*100)/salary3);
                break;
        }
        System.out.println(result1+"%");
    }
}


