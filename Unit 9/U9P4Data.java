import java.util.ArrayList;   //Import statements 
import java.util.Scanner;

public class U9P4Data {
    Scanner sc = new Scanner(System.in);
    ArrayList<Appointment> appointments = new ArrayList<>();          //Makes appointments array list 
    int sentinel1 = 0;
    int sentinel2 = 0;
    int option1 = 0;
    String description = "";        //Instance variables 
    int day;
    int month;
    int year;
    int sentinel3 = 0;
    int option2 = 0;
    public void menu()
    {
        sentinel3 = 0;
        while(sentinel3 != -1)
        {
            System.out.println("1)New appointment\n2)Appointment check\n3)End program");        //Prints menu 
            option2 = sc.nextInt();
            if(option2 == 1)
            {
                newAppointment();
            }
            if(option2 == 2)
            {
                appointmentCheck();
            }
            if(option2 != 1 && option2 != 2)
            {
                System.out.println("Invalid value. Terminating program.");
                System.exit(0);               //Terminates program for invalid value
            }
            System.out.println("Run through the menu again? -1 for no, 1 for yes");       //Runs trough menu again 
            sentinel3 = sc.nextInt();
        }
        System.out.println("Thank you for using this program!");
    }
    public void appointmentCheck()
    {
        sentinel2 = 0;
        while(sentinel2 != -1)
        {
            System.out.println("What year would you like to check?");
            year = sc.nextInt();                                                   //Asks user for date to check 
            System.out.println("What month would you like to check?");
            month = sc.nextInt();
            System.out.println("What day would you like to check?");
            day = sc.nextInt();
            if(month <= 12)
            {
                if(day <= 30)
                {
                    for(Appointment a : appointments)
                    {
                        if(a.typeOfAppointment() == "Onetime")          //Prints all items in array list if they have appointment or not 
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
            
            System.out.println("Would you like to check another date? -1 for no, 1 for yes");
            sentinel2 = sc.nextInt();  //Asks user if the ywould like to check another date 
                                          
        }
        
    }
    public void newAppointment()
    {
        sentinel1 = 0;
        while(sentinel1 != -1)
        {
            option1 = 0;
            System.out.println("What type of appointment would you like to make?\n1) One time appointment\n2) Monthly appointment\n3) Daily appointment");
            option1 = sc.nextInt();
            if(option1 == 1)
            {
                sc.nextLine();
                System.out.println("What is the reason for the appointment?");
                description = sc.nextLine();
                System.out.println("What year for the appointment?");
                year = sc.nextInt();
                System.out.println("What month for the appointment?");                  //Asks user for onetime appointnment details 
                month = sc.nextInt();
                System.out.println("What day for the appointment?");
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
                System.out.println("What day for the appointment?");           //asks user for monthly appointment details 
                day = sc.nextInt();
                if(day <= 30)
                {
                    appointments.add(new Monthly(day, 0, 0, description));
                }
            }
            else if(option1 == 3)
            {
                sc.nextLine();
                System.out.println("What is the reason for the appointment?");        //Asks user for dailuy appoinntment details 
                description = sc.nextLine();
                appointments.add(new Daily(0, 0, 0, description));
            }
            else
            {
                System.out.println("Invalid value. Terminating program.");
                System.exit(0);
            }
            System.out.println("Set up another appointment? -1 for no, 1 for yes");       //Asks user if they want to set up another appointment 
            sentinel1 = sc.nextInt();

        }
    }
}
