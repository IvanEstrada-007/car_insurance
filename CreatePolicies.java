// chapter 4 practice exercise & goes with CarInsurancePolicy

public class CreatePolicies
{
	public static void main(String[] args)
	{
		// Variables and Constants
		CarInsurancePolicy first = new CarInsurancePolicy(123);
		CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
		CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");
		


		// output phase 
		first.display();
		second.display();
		third.display();
	}
}