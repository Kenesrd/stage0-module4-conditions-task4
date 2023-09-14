package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int assignmentNum = (first > second) ? 10 : -10;
        System.out.println(assignmentNum);
    }
}
