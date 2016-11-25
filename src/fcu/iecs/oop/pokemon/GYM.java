package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2)
	{
		if(Math.random()*10<5)
		{
			System.out.println("Winner is "+p1.getName());
			p1.setCp(p1.getCp()+500);
		}
		else
		{
			System.out.println("Winner is "+p2.getName());
			p2.setCp(p2.getCp()+500);
		}
	}
}
