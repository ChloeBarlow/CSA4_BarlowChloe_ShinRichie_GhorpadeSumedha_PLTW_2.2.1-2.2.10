import java.util.Calendar;

public class Date {

  public static String currentDate() {
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }

}
