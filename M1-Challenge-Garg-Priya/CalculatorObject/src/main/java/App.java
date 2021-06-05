public class App {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        System.out.println("Addition of two integers is " + cal.addition(1, 1));
        System.out.println("Addition of two double is " + cal.addition(3.4, 2.3));
        System.out.println("Subtraction of two integers is " + cal.subtraction(23, 52));
        System.out.println("Subtraction of two double is " + cal.subtraction(5.5, 0.5));
        System.out.println("Multiplication of two integers is " + cal.multiplication(34, 2));
        System.out.println("Multiplication of two double is " + cal.multiplication(6.7, 4.4));
        System.out.println("Division of two integers is " + cal.division(12, 3));
        System.out.println("Division of two integers is " + cal.division(12, 7));
        System.out.println("Division of two double is " + cal.division(10.8, 2.2));
    }

}
