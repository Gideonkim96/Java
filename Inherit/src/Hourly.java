public class Hourly extends Empoyee{

    private double hourPay;

    public Hourly(String name, String dob, String hiredDate, double hourPay) {
        super(name, dob, hiredDate);
        this.hourPay = hourPay;
    }

    @Override
    public double collectPay(){
        return 40* hourPay;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }

}
