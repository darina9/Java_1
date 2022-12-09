import java.util.Scanner;

public class DZ_4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = Scanner.nextInt();
        System.out.print("Введите тип операции(+ - * /): ");
        String operation = Scanner.next();
        float result = Calc(a, b, operation);
        
        System.out.printf("%d %s %d = %.2f", a, operation, b, result);
        Scanner.close();
    }
    public static float Calc(int a, int b, String operation) {
        float result = 0;
        switch(operation){
             
            case "+": 
                result = a + b;
                break;
            case "-": 
                result = a - b;
                break;
            case "*": 
                result = a * b;
                break;
            case "/": 
                result = (float) a / (float) b;
                break;
           
        }
        return result;
    }
}



    

        