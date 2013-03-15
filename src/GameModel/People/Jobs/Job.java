
package GameModel.People.Jobs;

/**
 * A Job is an occupation that a person has.
 * It allows them to work to produce income.
 * @author James
 */
public class Job
{
    private double income;
    private String description;
    private double workHours;
    public double getHourlyWage()
    {
        return 0.0;
    }

    public double getIncome() {
        return income;
    }

    public String getDescription() {
        return description;
    }

    public double getWorkHours() {
        return workHours;
    }
    
}
