package Q09;

import java.math.BigInteger;
import java.util.*;


public class Q09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> v = new ArrayList<>();
		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add((short)(100));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("Snoopy");
		v.add(new BigInteger("1000"));

		for(Object count:v){
		System.out.println(count);
		}

		for(Object count:v){
			String a1=count.getClass().getName();
			if(a1.equals("java.lang.Integer"))
		System.out.println(count.getClass().getName());
		}
	}

}
