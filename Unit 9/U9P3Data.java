import java.util.ArrayList;    //Imports 
import java.util.Scanner;

public class U9P3Data {
    public void menu()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Appointment> appointments = new ArrayList<>();
        int sentinel1 = 0;
        int sentinel2 = 0;            //Instance variables 
        int option1 = 0;
        String description = "";
        int day;
        int month;
        int year;
        while(sentinel1 != -1)
        {
            option1 = 0;
            System.out.println("What type of appointment would you like to make?\n1) One time appointment\n2) Monthly appointment\n3) Daily appointment");     //Prints menu 
            option1 = sc.nextInt();
            if(option1 == 1)
            {
                sc.nextLine();
                System.out.println("What is the reason for the appointment?");
                description = sc.nextLine();
                System.out.println("What year for the appointment?");
                year = sc.nextInt();
                System.out.println("What month for the appointment?");         //Asks user for one time appointment details 
                month = sc.nextInt();
                System.out.println("What day for the appointment? (Less than or equal to 30 please)");
                day = sc.nextInt();
                if(month <= 12)
                {
                    if(day <= 30) //sets day limit to 30 to not complicate things 
                    {
                        appointments.add(new Onetime(day, month, year, description));
                    }                                             
                }


            }
            else if(option1 == 2)
            {
                sc.nextLine();
                System.out.println("What is the reason for the appointment?");
                description = sc.nextLine();
                System.out.println("What day for the appointment? (Less than or equal to 30 please)");             //Asks user for monthly appointment details 
                day = sc.nextInt();
                if(day <= 30)
                {
                    appointments.add(new Monthly(day, 0, 0, description));
                }
            }
            else if(option1 == 3)
            {
                sc.nextLine();
                System.out.println("What is the reason for the appointment?");              //Asks user for daily appointment details 
                description = sc.nextLine();
                appointments.add(new Daily(0, 0, 0, description));
            }
            else
            {
                System.out.println("Terminating program.");       //terminates program if something else is entered 
                System.exit(0);
            }
            System.out.println("Set up another appointment? -1 for no, 1 for yes");           //Asks user if another appointment would like to be set up
            sentinel1 = sc.nextInt();

        }
        while(sentinel2 != -1)
        {
            System.out.println("What year would you like to check?");
            year = sc.nextInt();
            System.out.println("What month would you like to check?");      //Asks user for date that would like to be checks 
            month = sc.nextInt();
            System.out.println("What day would you like to check?");
            day = sc.nextInt();
            if(month <= 12)
            {
                if(day <= 30)       //Checks if its a valid day 
                {
                    for(Appointment a : appointments)
                    {
                        if(a.typeOfAppointment() == "Onetime")                //Prints depending on outcome 
                        {
                            if(a.occursOn(day, month, year))
                            {
                                System.out.println("A one time appointment with the description \"" + a.returnDescription() + "\" occurs on the day inputted!");
                            }
                            else
                            {
                                System.out.println("A one time appointment with the description \"" + a.returnDescription() + "\" does not occur today! It occurs on the year " + a.returnYear() + ", the month " + a.returnMonth() + ", and the day " + a.returnDay());
                            }
                        }
                        else if(a.typeOfAppointment() == "Monthly")
                        {
                            if(a.occursOn(day, 0, 0))
                            {
                                System.out.println("A monthly appointment with the description \"" + a.returnDescription() + "\" occurs on the day inputted!");
                            }
                            else
                            {
                                System.out.println("A monthly appointment with the description \"" + a.returnDescription() + "\" does not occur today! It occurs every month on day " + a.returnDay());
                            }
                        }
                        else if(a.typeOfAppointment() == "Daily")
                        {
                            System.out.println("A daily appointment with the description \"" + a.returnDescription() + "\" occurs today!");
                        }
                    }
                }
            }
            
            System.out.println("Would you like to check another date? -1 for no, 1 for yes");      //Asks user if they would like to check another date 
            sentinel2 = sc.nextInt();

        }
    }
}
