package Sept.Task;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        for(i=0;i<=100;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(1%3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i%5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}