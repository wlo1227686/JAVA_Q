package Q07;

import java.util.*;

public class Q07_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticCodeBlock.season);
	}

}

class StaticCodeBlock{
	static String season;
	static {
		Calendar c = Calendar.getInstance();
		int mon=c.get(Calendar.MONTH)+1;
		System.out.println(mon);
		if (mon<=5 && mon>=3){season="�K��";}
		else if (mon<=8 && mon>=6){season="�L��";}
		else if (mon<=11 && mon>=9){season="���";}
		else season="�V��";
	}
}

