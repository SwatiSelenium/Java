package Java;

class National
{
	void NationalHighway()
	{
		System.out.println("National highway");
	}
}
class State1 extends National
{
	void SH()
	{
		System.out.println("state highway");
	}
}
public class Country extends State1
{
	void CH()
	{
		System.out.println("City highway");
	}
	public static void main(String[] args) 
	{
		Country c1 = new Country();
		c1.CH();
		c1.SH();
		c1.NationalHighway();
	}
}
