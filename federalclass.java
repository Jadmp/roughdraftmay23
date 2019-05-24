package allmyclasses;

public class FederalRate {
	
	UserInput uIObject = new UserInput();
	double income = uIObject.getIncome();
	String state = uIObject.getInput();
	double fedtax = uIObject.fedtax;
	boolean maritalStatus = uIObject.getMaritalStatus();
	
	if(income <= 0)
	{
		System.out.println("You pay no taxes!");
	}
	if(!maritalStatus)
	{
		if(income <= 9525)
		{
			fedtax = (9525 * .1);
		}
		if(income <= 38700)
		{
			fedtax = (9525 * .1) + (29175 * .12);
		}
		if(income <= 82500)
		{
			fedtax = (9525 * .1) + (29175 * .12) + (43800 * .22);
		}
		if(income <= 157500)
		{
			fedtax = (9525 * .1) + (29175 * .12) + (43800 * .22) + (75000 * .24);
		}
		if(income <= 200000)
		{
			fedtax = (9525 * .1) + (29175 * .12) + (43800 * .22) + (75000 * .24) + (42500 * .32);
		}
		if(income <= 500000)
		{
			fedtax = (9525 * .1) + (29175 * .12) + (43800 * .22) + (75000 * .24) + (42500 * .32) + (300000 * .35);
		}
		if(income > 500000)
		{
			fedtax = (9525 * .1) + (29175 * .12) + (43800 * .22) + (75000 * .24) + (42500 * .32) + (300000 * .35) + ((income - 500000) * (.37))
		}
	}
	else if(maritalStatus)
	{
		if(income <= 19050)
		{
			fedtax = (19050 * .1);
		}
		if(income <= 77400)
		{
			fedtax = (19050 * .1) + (58350 * .12);
		}
		if(income <= 165000)
		{
			fedtax = (19050 * .1) + (58350 * .12) + (87600 * .22);
		}
		if(income <= 315000)
		{
			fedtax = (19050 * .1) + (58350 * .12) + (87600 * .22) + (150000 * .24);
		}
		if(income <= 400000)
		{
			fedtax = (19050 * .1) + (58350 * .12) + (87600 * .22) + (150000 * .24) + (85000 * .32);
		}
		if(income <= 600000)
		{
			fedtax = (19050 * .1) + (58350 * .12) + (87600 * .22) + (150000 * .24) + (85000 * .32) + (200000 * .35);
		}
		if(income > 600000)
		{
			fedtax = (19050 * .1) + (58350 * .12) + (87600 * .22) + (150000 * .24) + (85000 * .32) + (200000 * .35) + ((income - 600000) * (.37));
		}
	}
}