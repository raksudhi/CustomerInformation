package controller;
import model.CustomerIO;
import nosuchcustomerexception. NoSuchCustomerException;

public class Customer {
	public String name;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	
	public Customer()
	{
		name = "";
		address = "";
		city = "";
		state = "";
		zipCode = "";
	}
	
	public String getNameAndAddress(int custNo)
	{
		
		Customer c = new Customer();
		try {
			c = CustomerIO.getCustomer(custNo);
		} catch (NoSuchCustomerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return c.name + "\n" + 
		c.address + "\n" + 
		c.city + "  " + c.state + "   " + c.zipCode;
	}

}
