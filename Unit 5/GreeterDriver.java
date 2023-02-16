import java.util.Scanner;
public class GreeterDriver {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a name");
    String name = sc.nextLine();
    Greeter greeter = new Greeter(name);
    String hey = greeter.sayHello();
    String noHelp = greeter.refuseHelp();
    String bye = greeter.sayGoodbye();
    System.out.print(hey + "\n");
    System.out.print(noHelp + "\n");
    System.out.print(bye + "\n");

    

    }
}
