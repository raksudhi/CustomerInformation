
public class NoSuchCustomerException extends Exception {
	private int customerNo;
	public NoSuchCustomerException()
	{
		System.out.println("The customer number does not exist");
		
	}
	
	public int getCustomerNumber(int custNo) 
	{
		customerNo = custNo;
		return customerNo;
	}
}
