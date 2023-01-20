package Review;

public class StepTracker {
    private int minsteps;
    private int dailySteps;
    private int days;
    private double average;

    public StepTracker(int minimumSteps) {
        dailySteps = 0;
        minsteps = minimumSteps;
        days = 0;
        average = 0;
    }

    public void addDailySteps(int dailySteps) {
        if (dailySteps > minsteps) {
            dailySteps += dailySteps;
            days++;
        } else {
            dailySteps += dailySteps;
        }

    }

    public double averageSteps() {
        return (double) dailySteps / (double) days;
    }

    public int activeDays() {
        return days;
    }
}