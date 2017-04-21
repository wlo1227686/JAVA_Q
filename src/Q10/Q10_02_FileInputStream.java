package Q10;

import java.io.*;

public class Q10_02_FileInputStream {

	public static void main(String[] args) {

		String Sample_url = "D:\\_Java\\workspace\\Java_Q\\Q10_Sample_BIG5.txt";
		int Get_char_by_FileReader = 0;
		int Line_count;
		int Char_count;
		File f1 = new File(Sample_url);
		try(
			FileInputStream fis = new FileInputStream(Sample_url);			
			){	
			Char_count = 0;
			Line_count = 0;
			while ((Get_char_by_FileReader = fis.read()) != -1) {
				if (Get_char_by_FileReader == 13) {
					Line_count++;
				}
//				System.out.println(Get_char_by_FileReader);
				Char_count++;
			}
			System.out.println("FileInputStream�w�g���R����");
			System.out.print(Sample_url.substring(Sample_url.lastIndexOf('\\') + 1, Sample_url.length()));
			System.out.println(" �t�� " + f1.length() + " �Ӧ줸�աA " + Char_count + " �Ӧr���A" + Line_count + " �C�Ӹ��");
		} catch (IOException e) {
			System.out.println("�o�Ͳ��`: " + e.getMessage());
		}
	}

	// InputStreamReader isr = new InputStreamReader(fis,Code_Mode);
	// FileOutputStream fos = new FileOutputStream(FileOutStream_url);
	// OutputStreamWriter osw = new OutputStreamWriter(fos,Code_Mode);
	// FileInputStream fis = new FileInputStream(f1);

}
