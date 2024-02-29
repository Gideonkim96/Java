public class Main {

    public static void main(String[] args) {

        Empoyee kim = new Empoyee("Kim", "17/10/2000","11/11/2011");
        System.out.println(kim);
        System.out.println("Age = " + kim.getAge());
        System.out.println("Pay = " + kim.collectPay());

        Salary joe = new Salary("joe","01/01/2002","12/12/2012", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
//        System.out.println("Pay = " + joe.collectPay());
        System.out.println("Joe pay is Ksh " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check= Ksh " + joe.collectPay());

        Hourly mary = new Hourly("Mary", "07/07/2000","12/12/2020",20);
        System.out.println(mary);
        System.out.println("Mary paycheck = Ksh " + mary.collectPay());
        System.out.println("Mary dec Pay = Ksh " + mary.getDoublePay());

    }
}
