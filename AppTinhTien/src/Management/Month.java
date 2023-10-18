package Management;

import java.util.ArrayList;

public class Month {
    private ArrayList<Day> listDay;

    public Month() {
        listDay = new ArrayList<Day>();
    }

    public ArrayList<Day> getListDay() {
        return listDay;
    }

    public void addDay(Day day) {
        listDay.add(day);
    }

    public int getNumDay() {
        return listDay.size();
    }

    public void remakeMonth() {
        listDay.clear();
    }
}
