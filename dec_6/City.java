package dec_6;
// Assignment_51
// interface  <---- Abstract class  <-  child class

interface Country
{
	void countrycollection();
}

abstract class State implements Country
{
	abstract void stateroads();
	void statecollection()
	{
		System.out.println("state collection");
	}
}

public class City extends State
{
	public static void main(String[] args) {
	City c1=new City();
	c1.countrycollection();
	c1.statecollection();
	c1.stateroads();

	}

	public void countrycollection() {
		System.out.println("country collection");
	}

	void stateroads() {
		System.out.println("state roads");
	}

}
