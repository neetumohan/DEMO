package Sept.Task;

public class TernaryOperator_Max {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c =30;
        int max_score = (a > b) ? (a>c ? a : c) : (b > c ? b : c);
        System.out.println(max_score);
    }
}
