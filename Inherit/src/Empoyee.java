public class Empoyee extends Worker{
    private long employeeId;
    private String hiredDate;

    private static int employeeNo =1;
    public Empoyee(String name, String dob, String hiredDate) {
        super(name, dob);
        this.employeeId = Empoyee.employeeNo++;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Empoyee{" +
                "employeeId=" + employeeId +
                ", hiredDate='" + hiredDate + '\'' +
                "} " + super.toString();
    }
}
