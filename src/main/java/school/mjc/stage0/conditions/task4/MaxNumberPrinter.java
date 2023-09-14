package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNum = 0;
        if (first >= second && first >= third){
            maxNum = first;
            System.out.println(maxNum);
        } else if (second >= first && second >= third){
            maxNum = second;
            System.out.println(maxNum);
        } else {
            maxNum = third;
            System.out.println(maxNum);
        }
    }
}
