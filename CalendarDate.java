//Rithy Sophorn
//Date: 4/12/2022

// The CalendarDate class stores information about a single 
// calendar date (month and day but no year). 

public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int day;
    private int year; //add year
    
    public CalendarDate(int month, int day, int year) {  
        this.month = month; 
        this.day = day; 
        this.year = year; //add year
    } 

    // Compares this calendar date to another date. 
    // Dates are compared by month and then by day. 
    public int compareTo(CalendarDate other) { 
        //add year
        if (year != other.year) {
            return year - other.year;
        } 

        if (month != other.month) { 
            return month - other.month; 
        } else { 
            return day - other.day;
        } 
    } 

    //add year method
    public int getYear() {
        return year;
    }
    
    public int getMonth() { 
        return month; 
        } 

    public int getDay() { 
        return day; 
        } 

    //add year into String    
    public String toString() { 
        return month + "/" + day + "/" + year; 
    } 
}

