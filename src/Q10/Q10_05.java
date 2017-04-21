package Q10;

import java.io.*;

public class Q10_05 {

	public static void main(String[] args) {
		String file_url = "D:\\_Java\\workspace\\Java_Q\\Q10_05_DATA";
		File f1 = new File(file_url);
		if(f1.exists()){
			
			try (				
				FileOutputStream fos = new FileOutputStream(f1+"\\data.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
				oos.writeObject(new Cat("kitty"));
				oos.writeObject(new Cat("jus"));
				oos.writeObject(new Dog("jack"));
				oos.writeObject(new Dog("grof"));
				System.out.println("執行成功");				
			} catch (IOException e) {
				System.out.println("發生異常: " + e.getMessage());
			}
			
		}else{
			f1.mkdir();System.out.println("資料夾建立完成");
		}
	}

}
