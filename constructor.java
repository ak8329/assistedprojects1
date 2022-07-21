class Std{
	int id;
	String name;

	Std(int id,String name)
	{
	this.id=id;
	this.name=name;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class constructor {
	public static void main(String[] args) {

		Std std1=new Std(2,"ak");
		Std std2=new Std(3,"avr");
		std1.display();
		std2.display();
			}


}

