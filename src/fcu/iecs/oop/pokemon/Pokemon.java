package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	public String getName() {
		return name;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}	
	Pokemon(String a,int b)
	{
		name=a;
		cp=b;
	}
}
