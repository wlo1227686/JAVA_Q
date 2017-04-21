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
		// <步驟一先寫入檔案>--------------------------------------------------
		try (FileOutputStream fos = new FileOutputStream(data_url, true);
				DataOutputStream dos = new DataOutputStream(fos);) {
			for (int i = 0; i < 10; i++) {
				int num = (int) (Math.random() * 1000 + 1);
				dos.write(num);
				System.out.print(" " + num);
			}

			System.out.println("\n步驟一寫入成功");
		} catch (IOException e) {
			System.out.println("發生異常: " + e.getMessage());
		}
		// <步驟二先寫入檔案>--------------------------------------------------
		try (FileInputStream fis = new FileInputStream(data_url); 
			 DataInputStream dis = new DataInputStream(fis);) {
			int count = 0;
			while((Read_data_buf=dis.read())!=-1){
				if(count%10==0){System.out.println();}
				System.out.print(" "+Read_data_buf);count++;
			}
			System.out.println("\n步驟二讀檔成功");
		} catch (IOException e) {
			System.out.println("發生異常: " + e.getMessage());
		}

	}

}
