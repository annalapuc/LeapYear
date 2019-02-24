public class Main {
    public static void main(String[] args) {
        boolean leap = LeapYearCalculator.isLeapYear(1700);
        System.out.println(leap);
        leap = LeapYearCalculator.isLeapYear(1900);
        System.out.println(leap);
        leap = LeapYearCalculator.isLeapYear(1600);
        System.out.println(leap);
    }
}
