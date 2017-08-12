package practice;

public class House
{

	public static void main(String[] args)
	{
		Pet p = new Goldfish();
//		Pet p = new Pet("Bob");
		
		if(Math.random() < 0.25) // 25% chance
			p = new Dog("Murray", "poodle");
		
		System.out.println(p.getName());
		System.out.println(p.toString()); // polymorphic
		System.out.println(p); // polymorphic
//		System.out.println(p.swim());
		System.out.println(p.willEat("chicken")); // polymorphic
		
		if(p instanceof Goldfish)
		{
			Goldfish gf = (Goldfish) p;
			System.out.println(gf.swim());
		}
		
		if(p instanceof Dog)
		{
			Dog d = (Dog) p;
			System.out.println(d.getBreed());
		}
		
		// The reference type determines what methods can be run.
		// The object type determines what method is actually run.
	}

}
