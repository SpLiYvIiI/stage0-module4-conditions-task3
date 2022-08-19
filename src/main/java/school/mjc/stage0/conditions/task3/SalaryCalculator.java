package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double answer = 0.0;
        if(salary < 0){
            System.out.println("wrong input!");
            return;
        }
        else if(salary <= 10000) {
            answer = salary - salary/100.0 * 15.0;
        }
        else if(10000 < salary && salary <= 20000){
            answer = salary - salary/100.0 * 18.0;
        }
        else {
            answer = salary - salary/100.0 * 20.0;
        }
        System.out.println(answer);
    }
}
