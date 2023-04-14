import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        
        System.out.println("informe os Mb's usados");
        a = input.nextInt();
        if (a > 100) {
            b = (a - 100) * 2 + 40;
            System.out.println("Valor à ser pago: R$" + b);
        } else {
            System.out.println("Valor à pagar: R$ 40");
        }
    }
}
