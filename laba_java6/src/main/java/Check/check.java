package Check;
import java.util.Scanner;

public class check {
    //Проверка для вещественных чисел
    public static double CheckDouble (String x_str) {
        int nums = 0; int dots = 0;
        for (int i = 0; i < x_str.length(); i++) {
            if (Character.isDigit(x_str.charAt(i))) 
                nums ++;
            if (x_str.charAt(i) == '.')
                dots ++;
        }   
        if (((dots == 1) && nums == x_str.length()-1) || ((dots == 0) && nums == x_str.length()) || ((dots == 1) && nums == x_str.length()-2 && x_str.charAt(0) == '-') || ((x_str.charAt(0) == '-') && nums == x_str.length()-1))
            return Double.parseDouble(x_str);
        else {
            System.out.print ("Ошибка ввода! Искусственый ввод 3.14\n");
            return 3.14;
        }
    }

    //Проверка ввода для целого число
    public static int CheckInt(String xStr) {
        int nums = 0;
        for (int i = 0; i < xStr.length(); i++) {
            if (Character.isDigit(xStr.charAt(i))) 
                nums ++;
        }   
        if (nums == xStr.length()) 
            return Integer.parseInt(xStr);
        else {
            System.out.print ("Ошибка ввода! Искусственый ввод 1\n");
            return 1;
        }
    }

    //Проверка ввода для чисел long
    public static long CheckLong(String x_str) {
        int nums = 0;
        for (int i = 0; i < x_str.length(); i++) {
            if (Character.isDigit(x_str.charAt(i))) 
                nums ++;
        }   
        if (nums == x_str.length()) 
            return Long.parseLong(x_str);
        else {
            System.out.print ("Ошибка ввода! Искусственый ввод 1\n");
            return 1;
        }
    }

    // Проверка целых чисел включая отрицательные
    public static int CheckIntWithNegative(String x_str) {
        int nums = 0;
        for (int i = 0; i < x_str.length(); i++) {
            if (Character.isDigit(x_str.charAt(i))) 
                nums ++;
        }   
        if (nums == x_str.length() || (nums == x_str.length() - 1 && x_str.charAt(0) == '-')) {
            return Integer.parseInt(x_str);
        } else {
            System.out.print ("Ошибка ввода! Искусственый ввод 1\n");
            return 1;
        }
    }

    public static boolean CheckStr(String x_str) {
        int nums = 0;
        for (int i = 0; i < x_str.length(); i++) {
            if (Character.isDigit(x_str.charAt(i))) 
                nums ++;
        }   
        return (nums == 0);
    }

    public static String CheckString(String x) {
        boolean check = CheckStr(x);
        while (check == false) {
            System.out.print("Ошибка ввода! Повторите ещё раз: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.next();
            check = CheckStr(x);
            scanner.nextLine();
        }
        return x;
    }
}
