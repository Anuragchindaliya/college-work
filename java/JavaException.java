import java.util.*;

public class JavaException {

    public static void main(String[] args) {

        int num1, num2, result;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("enter the 1st number: ");
            num1 = sc.nextInt();
            System.out.println("enter the 2nd number: ");
            num2 = sc.nextInt();
            result = num1 / num2;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by 0");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finnaly block Must execute whether exception occurs or not");
        }

    }
}
