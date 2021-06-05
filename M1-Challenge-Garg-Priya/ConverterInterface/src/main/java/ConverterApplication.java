public class ConverterApplication {
    public static void main(String[] args) {
        Converter convertWithIf = new ConverterIf();
        Converter convertWithSwitch = new ConverterSwitch();
        System.out.println("Month for this number is " + convertWithIf.convertMonth(5));
        System.out.println("Day for this number is " + convertWithIf.convertDay(4));
        System.out.println("Month for this number is " + convertWithSwitch.convertMonth(8));
        System.out.println("Day for this number is " + convertWithSwitch.convertDay(7));
    }
}
