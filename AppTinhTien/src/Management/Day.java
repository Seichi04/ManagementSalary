package Management;

import java.time.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Day {
    private LocalDate date;
    private LocalTime inTime;
    private LocalTime outTime;

    //constructor
    public Day(String in,String out) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
        date = LocalDate.now();
        try {
            this.inTime = LocalTime.parse(in, formatter);
        } catch (Exception e) {
            System.out.println("Lỗi: Định dạng thời gian vào không hợp lệ.");
        }

        try {
            this.outTime = LocalTime.parse(out, formatter);
        } catch (Exception e) {
            System.out.println("Lỗi: Định dạng thời gian ra không hợp lệ.");
        }
    }

    //getter
    @Override
    public String toString () {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Thời gian vào: " + inTime.format(formatter) + "\nThời gian ra: " + outTime.format(formatter) + "\nNgày: " + date.format(formatter2);
    }

    public long getHour() {
        return Math.abs(Duration.between(outTime,inTime).toHours());
    }

}
