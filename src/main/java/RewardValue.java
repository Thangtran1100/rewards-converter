public class RewardValue {
    private double cashValue;

    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue)
    {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public int getMilesValue()
    {
        return convertCashToMiles(this.cashValue);
    }

    private static double convertMilesToCash(int milesValue)
    {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int convertCashToMiles(double cashValue)
    {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
}
