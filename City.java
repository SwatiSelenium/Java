package Java;

class State
{
	void StateHighway()
	{
		System.out.println(" I am travelling in state");
	}
}
public class City extends State
{
	static void CityHighway()
	{
		System.out.println(" I am travelling in city");
	}
	public static void main(String[] args) 
	{
		CityHighway();
		City c1 = new City();
		c1.StateHighway();
	}
}
