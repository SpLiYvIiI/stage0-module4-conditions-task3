package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }
        int answer = -1;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            answer = 30;
        } else {
            if (month == 2) {
                answer = 28;
            } else {
                answer = 31;
            }
        }
        System.out.println(answer);
    }
}
