public class LeapYear {
    public static void main (String [] args) {
        int year = 2019;
        boolean isLeapYear = (year % 4 == 0) ;
        System.out.println(year + " is a leap year? "+ isLeapYear);
    }
}
