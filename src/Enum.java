public class Enum {

    public static void main(String[] args) {
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day);
    }

    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
