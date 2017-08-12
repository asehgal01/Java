package practice;

public class Dog extends Pet // a Dog is a Pet
{
	private String breed;
	
	public Dog(String name, String breed)
	{
		super(name);
		this.breed = breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public String toString()
	{
		// "My pet ___ is a dog"
//		return "My pet " + getName() + " is a dog";
		return super.toString() + " is a dog";
	}
	
	public boolean willEat(String foodType)
	{
		return true;
	}
}