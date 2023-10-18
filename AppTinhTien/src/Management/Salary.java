package Management;

import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Salary {
    private float money;
    private Year inYear;

    public Salary () {
        this.money = 100;
        this.inYear = Year.now();
    }
    public Salary (int inYear) {

        this.inYear = Year.of(inYear);
        this.money = 100* (float)Math.pow( (double)1.1 ,(double)(ChronoUnit.YEARS.between(this.inYear, Year.now())) );
    }

    public float getMoney() {
        return money;
    }
    public long getExperiment() {
        return ChronoUnit.YEARS.between(inYear, Year.now());
    }


}
