package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Owners {
    private String name;
    private int birth;
    private int id;
    private float totalFeePaid;
    private ArrayList<Employee> employees;
    static private int count =0;

    //constructor
    public Owners (String name,int birth) {
        count ++;
        this.name = name;
        this.birth = birth;
        this.id = count;
        this.totalFeePaid = 0;
        this.employees = new ArrayList<Employee>();
    }

    //getter
    public String getName() {
        return this.name;
    }
    public int getBirth() {
        return this.birth;
    }
    public int getId() {
        return this.id;
    }
    public float getTotalFeePaid() {
        return this.totalFeePaid;
    }
    public ArrayList<Employee> getEmployees () {
        return employees;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    

    //////
    public void updateFeePaid(int fee) {
        this.totalFeePaid = fee;
    }
    public void updateFeePaid() {
        this.totalFeePaid =0;
        for(Employee employee:employees) {
            this.totalFeePaid = this.totalFeePaid + employee.calTotalSalary();
        }
    }


    public void addFeePaid(int fee) {
        this.totalFeePaid += fee;
    }
    public void minusFeePaid(int fee) {
        this.totalFeePaid -= fee;
    }

    ////
    public void addEmployee() {
        Scanner scan = new Scanner(System.in);
        String name;
        int birth;
        int year;
        System.out.println("Nhâp tên nhân viên: ");
        name = scan.nextLine();
        System.out.println("Nhập năm sinh: ");
        birth = scan.nextInt();
        System.out.println("Nhập năm bắt đầu làm ở doanh nghiệp (nếu đây là lần đầu làm thì điền là 0): ");
        year = scan.nextInt();

        if(year !=0)
            employees.add(new Employee(name, birth, year));
        else
            employees.add(new Employee(name, birth));
    }
}
