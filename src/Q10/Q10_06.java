package Q10;

import java.io.*;

public class Q10_06 {

	public static void main(String[] args) {
		String file_url = "D:\\_Java\\workspace\\Java_Q\\Q10_05_DATA\\data.dat";
		Mammal m;
		try (				
				FileInputStream fos = new FileInputStream(file_url);
				ObjectInputStream ois = new ObjectInputStream(fos);){
			
				try {
					while( ( m=(Mammal)ois.readObject() ) !=null){
						m.smile();
					}
				} catch (Exception e) {
					System.out.println("讀取完畢");	
				}
			} catch (IOException e) {
				System.out.println("發生異常: " + e.getMessage());
			}
	}

}
