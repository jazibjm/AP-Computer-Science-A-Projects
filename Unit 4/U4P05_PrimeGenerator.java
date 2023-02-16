public class U4P05_PrimeGenerator 
{
    public void nextPrime(int input)
    {
        boolean isPrime;
        int numberofPrime = 0;
        System.out.println("The prime numbers are: ");                    
        for(int j = 2; j <= input; j++)                      //Checks every number that is less than the input value 
        {
            isPrime = true;
            for(int i = 2; i < j; i++)                  
            {
                if(j % i == 0)                    //If a non prime number is found this condition is true 
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)                                         //Checks if the number is prime so that it can print it out
            {
                System.out.print(j + " ");
                numberofPrime++;
            }
            
        }
        if(numberofPrime == 0)                                                    //Just in case the user enters something like "1" 
        {
            System.out.print("No prime numbers under " + input);
        }
    }  
}
