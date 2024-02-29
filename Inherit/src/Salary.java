public class Salary extends Empoyee{
    double annualSalary;
    boolean isRetired;

    public Salary(String name, String dob, String hiredDate, double annualSalary) {
        super(name, dob, hiredDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary/12;
        double adjustPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustPay;
    }

    public void retire(){
        terminate("12/12/2024");
        isRetired = true;
    }

}
