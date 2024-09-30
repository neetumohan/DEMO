package Sept.Task;

public class DoWhile {
    public static void main(String[] args) {
        int x = 1;
        int num = 5;
        do {
            if(x%2 == 0)
            {
                System.out.println(x);
            }
            x++;
        }while(x<=num);
    }
}
