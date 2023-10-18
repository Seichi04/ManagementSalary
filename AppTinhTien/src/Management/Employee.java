package Management;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int birth;
    private int id;
    private Salary salary;
    private Month month;

    private static int count =0;

    //constructor
    public Employee (String name,int birth) {
        count ++;
        this.name = name;
        this.birth = birth;
        this.id = count;
        this.salary = new Salary();
        this.month = new Month();
    }
    public Employee (String name,int birth,int Year) {
        count ++;
        this.name = name;
        this.birth = birth;
        this.id = count;
        this.salary = new Salary(Year);
        this.month = new Month();
    }

    //getter
    public Salary getSalary() {
        return salary;
    }
    public float getMoney() {
        return getSalary().getMoney();
    }
    public long getExperiment () {
        return getSalary().getExperiment();
    }
    public Month getMonth() {
        return month;
    }





    public float calTotalSalary() {
        float totalSalary =0;
        ArrayList<Day> temp = this.month.getListDay();
        for(Day day:temp) {
            totalSalary = totalSalary + day.getHour()*salary.getMoney();
        }
        return totalSalary;
    }
}
