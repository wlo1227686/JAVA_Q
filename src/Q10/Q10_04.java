package Q10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q10_04 {

	public static void main(String[] args) {
		String data_url = "D:\\_Java\\workspace\\Java_Q\\Q10_03_Data.txt";
		int Read_data_buf=0;
		// <�B�J�@���g�J�ɮ�>--------------------------------------------------
		try (FileOutputStream fos = new FileOutputStream(data_url, true);
				DataOutputStream dos = new DataOutputStream(fos);) {
			for (int i = 0; i < 10; i++) {
				int num = (int) (Math.random() * 1000 + 1);
				dos.write(num);
				System.out.print(" " + num);
			}

			System.out.println("\n�B�J�@�g�J���\");
		} catch (IOException e) {
			System.out.println("�o�Ͳ��`: " + e.getMessage());
		}
		// <�B�J�G���g�J�ɮ�>--------------------------------------------------
		try (FileInputStream fis = new FileInputStream(data_url); 
			 DataInputStream dis = new DataInputStream(fis);) {
			int count = 0;
			while((Read_data_buf=dis.read())!=-1){
				if(count%10==0){System.out.println();}
				System.out.print(" "+Read_data_buf);count++;
			}
			System.out.println("\n�B�J�GŪ�ɦ��\");
		} catch (IOException e) {
			System.out.println("�o�Ͳ��`: " + e.getMessage());
		}

	}

}
