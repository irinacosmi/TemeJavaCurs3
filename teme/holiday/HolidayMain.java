package com.java.training.d03.teme.holiday;

public class HolidayMain {
    public static void main(String[] args) {
        Summerholiday summerholiday = new Summerholiday("Dubai");
        summerholiday.setName("Summer");
        summerholiday.setNumberDays(14);
        Summerholiday summerholiday1 = new Summerholiday("SUA");
        Weekend weekend = new Weekend("Avengers");
        weekend.setName("Last Weekend home");
        weekend.setNumberDays(2);
        Weekend weekend1 = new Weekend("Beauty and the Beast");

        System.out.println(summerholiday instanceof Summerholiday);
        AbstractHoliday holiday = (AbstractHoliday) summerholiday;
        System.out.println(holiday.toString());

        System.out.println(weekend.equals(weekend1));
        hashCode(summerholiday);
        System.out.println(weekend.toString());

        summerholiday.displayHoliday();
        summerholiday.goingOut();
        weekend1.goingOut();
        weekend.displayHoliday();
    }

    private static void hashCode(Summerholiday summerholiday){
        System.out.println(summerholiday.hashCode());
    }
}
