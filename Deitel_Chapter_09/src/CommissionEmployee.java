
// Usually we do not directly say it 'extends Object'
public class CommissionEmployee extends Object
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commisionRate)
	{
		if (grossSales < 0.0)
		{
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		if (commisionRate <= 0.0 || commisionRate >= 1.0)
		{
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commisionRate;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double earnings()
	{
		return getCommissionRate() + getGrossSales();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"commission employee", getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}

}
