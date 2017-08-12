package practice;

public class Goldfish extends Pet
{
	public Goldfish()
	{
		super("Goldie");
	}
	
	public String toString()
	{
		return super.toString() + " is a goldfish";
	}
	
	public int swim()
	{
		return (int) (Math.random() * 10);
	}
	
	public boolean willEat(String foodType)
	{
		return foodType.equals("fish food");
	}
}