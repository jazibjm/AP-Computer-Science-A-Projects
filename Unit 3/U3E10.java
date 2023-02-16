import java.util.Scanner;
public class U3E10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");                                    //Prompts user for name, hourly salary, and hours worked in the past week. 
        String name = sc.next();
        System.out.println("What is your hourly salary?");
        Double salary = sc.nextDouble();
        System.out.println("How many hours did you work for in the past week?");
        Double hours = sc.nextDouble();
        Paycheck paycheck = new Paycheck();
        Double result = paycheck.result(name, salary, hours);                        //Sends stuff to paycheck class 
        sc.close();
    }

}
