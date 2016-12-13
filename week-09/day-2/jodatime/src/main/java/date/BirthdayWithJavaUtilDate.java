package date;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {
    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        Date date = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try{
            date = df.parse(str);
        }
        catch ( Exception e ){
            System.out.println(e);
        }
        return date;
    }
    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        Format formatter = new SimpleDateFormat("MM. dd.");
        String s = formatter.format(date);
        return s;
    }
    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date
       // DateFormat dateFormat = new SimpleDateFormat("MM. dd.");
        Date dateCurrent = new Date();
      // dateFormat.format(dateCurrent);
      //  date.compareTo(dateCurrent) == 0;
        if (printMonthAndDay(date).equals (printMonthAndDay(dateCurrent))) {
            return true;
        }
        return false;
    }
    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was
        Date now = new Date();
        long timeBetween = birthday.getTime() - now.getTime();
        double yearsBetween = timeBetween / 3.15576e+10;
        int age = (int) Math.floor(yearsBetween);

        return age;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        return -1;
    }
    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }
    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
