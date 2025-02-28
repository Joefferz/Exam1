
/**
 * Write a description of class NetPay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NetPay
{
    private double taxAndDeduction = 0.3;
    private double totalSalary;
    private double netPay;
    
    //Fix: Changed return type to void.(Question did not ask for a return but an output)
    public void getNetPay(double amountOfHours, double hourlyWage)
    {
        totalSalary = amountOfHours * hourlyWage;
        //Fix: Outputs proper netpay instead of amount of tax and deduction.
        netPay = totalSalary - (totalSalary * taxAndDeduction);
        System.out.println(netPay);
    }
}
