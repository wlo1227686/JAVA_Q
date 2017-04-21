package Q10;

import java.io.*;

public class Q10_03 {

	public static void main(String[] args) {
		String data_url = "D:\\_Java\\workspace\\Java_Q\\Q10_03_Data.txt";
		
//<步驟一先寫入檔案>--------------------------------------------------		
		try(
			FileOutputStream fos = new FileOutputStream(data_url);
			DataOutputStream dos = new DataOutputStream(fos);
			){
			float data_a = 17.625f;
			dos.writeDouble(data_a);
			System.out.println("步驟一寫入成功");
		} catch (IOException e) {
			System.out.println("發生異常: " + e.getMessage());
		}
//<步驟二先寫入檔案>--------------------------------------------------			
		try(
				FileInputStream fis = new FileInputStream(data_url);
				DataInputStream dis = new DataInputStream(fis);
				){
					System.out.println(dis.readDouble());
					System.out.println("步驟二讀檔成功");
			} catch (IOException e) {
				System.out.println("發生異常: " + e.getMessage());
			}		
	
	}

}
