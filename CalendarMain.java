//Rithy Sophorn
//Date: 4/12/2022

import java.util.ArrayList;
import java.util.Collections;

public class CalendarMain {
    public static void main (String [] args) {

        CalendarDate cd1 = new CalendarDate(7,7,1977);
        CalendarDate cd2 = new CalendarDate(4,12,2022);
        CalendarDate cd3 = new CalendarDate(9,12,2007);
        CalendarDate cd4 = new CalendarDate(2,3,2002);
        CalendarDate cd5 = new CalendarDate(5,3,2016);

        ArrayList <CalendarDate> cDate = new ArrayList <CalendarDate> ();
        cDate.add(cd1);
        cDate.add(cd2);
        cDate.add(cd3);
        cDate.add(cd4);
        cDate.add(cd5);

        System.out.println("Calendar dates in the arrayList before sorting: " + cDate);

        Collections.sort(cDate);

        System.out.println("Calendar dates after sorting: " + cDate);
    }
}
