
public class CommissionEmployeeTest {

	public static void main(String[] args)
	{
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		System.out.println(commissionEmployee);
		
		System.out.println("\n");
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob",
				"Jones", "111-11-1111", 10000, .06, 1000);
		System.out.println(basePlusCommissionEmployee);
	}

}
