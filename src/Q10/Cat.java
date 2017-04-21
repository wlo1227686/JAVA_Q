package Q10;

import java.io.Serializable;

public class Cat extends Mammal implements Serializable{
	String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
	@Override
	public void smile(){
		System.out.println("Cat=>"+name+":)");
	}
	public void meao(){
		System.out.println("Cat=>"+name+"meaomeao");
	}
	
}
