public class ConverterIf implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
        if (monthNumber == 1) {
            return "January";
//            System.out.println("January");
        } else if (monthNumber == 2) {
            return "February";
//            System.out.println("February");
        } else if (monthNumber == 3) {
            return "March";
//            System.out.println("March");
        } else if (monthNumber == 4) {
            return "April";
//            System.out.println("April");
        } else if (monthNumber == 5) {
            return "May";
//            System.out.println("May");
        } else if (monthNumber == 6) {
            return "June";
//            System.out.println("June");
        } else if (monthNumber == 7) {
            return "July";
//            System.out.println("July");
        } else if (monthNumber == 8) {
            return "August";
//            System.out.println("August");
        } else if (monthNumber == 9) {
            return "September";
//            System.out.println("September");
        } else if (monthNumber == 10) {
            return "October";
//            System.out.println("October");
        } else if (monthNumber == 11) {
            return "November";
//            System.out.println("November");
        } else if (monthNumber == 12) {
            return "December";
//            System.out.println("December");
        } else {

            System.out.println("The number is not between 1-12 so cannot be converted into month.");
            return null;
        }

    }

    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            return "Monday";
        } else if (dayNumber == 2) {
            return "Tuesday";
        } else if (dayNumber == 3) {
            return "Wednesday";
        } else if (dayNumber == 4) {
            return "Thursday";
        } else if (dayNumber == 5) {
            return "Friday";
        } else if (dayNumber == 6) {
            return "Saturday";
        } else if (dayNumber == 7) {
            return "Sunday";
        } else {
            System.out.println("The number is not between 1-7 so cannot be converted into day.");
            return null;
        }
    }
}
