package Q10;

import java.io.*;

public class Q10_03 {

	public static void main(String[] args) {
		String data_url = "D:\\_Java\\workspace\\Java_Q\\Q10_03_Data.txt";
		
//<�B�J�@���g�J�ɮ�>--------------------------------------------------		
		try(
			FileOutputStream fos = new FileOutputStream(data_url);
			DataOutputStream dos = new DataOutputStream(fos);
			){
			float data_a = 17.625f;
			dos.writeDouble(data_a);
			System.out.println("�B�J�@�g�J���\");
		} catch (IOException e) {
			System.out.println("�o�Ͳ��`: " + e.getMessage());
		}
//<�B�J�G���g�J�ɮ�>--------------------------------------------------			
		try(
				FileInputStream fis = new FileInputStream(data_url);
				DataInputStream dis = new DataInputStream(fis);
				){
					System.out.println(dis.readDouble());
					System.out.println("�B�J�GŪ�ɦ��\");
			} catch (IOException e) {
				System.out.println("�o�Ͳ��`: " + e.getMessage());
			}		
	
	}

}
