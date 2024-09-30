package Sept.Task;

public class TernaryOperator {
    public static void main(String[] args) {
        int input = 84;
        String grade = (input >= 90) ? "A" : (input >= 80) ? "B" : (input >= 70) ? "C" : "D";
        System.out.println(grade);
    }
}
