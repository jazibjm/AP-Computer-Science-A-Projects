public class Greeter {
    private String privateName;
    private String returnValue;
    public Greeter()
    {
        returnValue = "";
        privateName = "";
    }
    public Greeter(String name)
    {
        returnValue = "";
        privateName = name;
    }
    public String sayHello()
    {
        returnValue = "Hello, " + privateName;
        return returnValue;
    }
    public String sayGoodbye()
    {
        returnValue = "Bye, " + privateName;
        return returnValue;

    }
    public String refuseHelp()
    {
        returnValue = "I am sorry, " + privateName  + ". I am afraid I cant do that.";
        return returnValue;
    }
}
