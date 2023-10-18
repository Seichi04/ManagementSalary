package Management;

public class Main {
    public static void main(String[] args) {
        Day day1 = new Day("5:11:05", "20:15:04");
        Day day2 = new Day("6:05:30","13:02:50");

        System.out.println(day1.getHour() + "\n"+day2.getHour());

        Month month1 = new Month();
        month1.addDay(day1);
        month1.addDay(day2);
    }
}
