package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float numberRound = Math.round(numberToBeRounded);
        int number = (int) numberRound;
        System.out.println(number);
    }
}
