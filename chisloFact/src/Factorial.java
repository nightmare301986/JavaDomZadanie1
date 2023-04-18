//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.*;
import java.math.*;

class Factorial {
    public static void main(String[] args) throws Exception {  //приглашение ко вводу и т.д.
        System.out.println("Введите число для нахождения факториала и треугольного числа");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Факториал равен:");
        System.out.println(factorial(n).toString());
        System.out.println("Треугольное число равно:");
        System.out.println(triangleNum(n));
        in.close();
    }

    public static BigInteger factorial(int n) { // поиск факториала числа
        BigInteger res = BigInteger.valueOf(1); //применил тип BigInteger т.к. необходимо рассчитывать больше числа
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static Integer triangleNum(int n) { // поиск треугольного числа
        int res1;  
        res1 = (n*(n+1)/2);
        return res1;
    }
}