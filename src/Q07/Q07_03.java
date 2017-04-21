package Q07;

public class Q07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyMary hm = new HappyMary();
	hm.smile();
	}

}
abstract class Human{
	int weight=50;
	abstract void smile();
}

abstract class OrdinaryPeople extends Human{

	
}
class HappyMary extends OrdinaryPeople{

	@Override
	void smile() {
		// TODO Auto-generated method stub
		System.out.println("haha");
	}
	
}