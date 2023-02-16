import java.time.LocalDate;

public class U2P09 {
    public static void main(String [] args)
    {
        LocalDate today = LocalDate.now();                               
        int year = today.getYear();
        LocalDate tenThousandDays = today.minusDays(10000);                                      //Gets todays date and the current year
        String piDay = LocalDate.of(year, 3, 14).getDayOfWeek().toString();
        String programmersDate = LocalDate.ofYearDay(year, 256).toString();
        String programmersDay = LocalDate.ofYearDay(year, 256).getDayOfWeek().toString();            //Converts all dates to day of the week and then converts it to string so its able to be printed 
        String tenKDays = tenThousandDays.getDayOfWeek().toString();
        String tenKDate = tenThousandDays.toString();
        System.out.println("Pi Day is on a: " + piDay);
        System.out.println("Programmers Day is: " + programmersDay + ", " + programmersDate);
        System.out.println("Ten Thousand Days earlier is: " + tenKDays + ", " + tenKDate);                                           //Prints out all calculated days of the date

    }
}
