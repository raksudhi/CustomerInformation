import java.util.*;

import nosuchcustomerexception. NoSuchCustomerException;
import controller.*;

public class CustomerInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Customer Application ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Number: ");
		int cnum = sc.nextInt();
		Customer customer = new Customer();
		try
		{	
			String str = customer.getNameAndAddress(cnum);
			
			if(str.equals(null))
				throw new NoSuchCustomerException();
			else
				System.out.println(str);
		}
		catch(NoSuchCustomerException e)
		{
			e.getCustomerNumber(cnum);
		}
		
		

	}

}
