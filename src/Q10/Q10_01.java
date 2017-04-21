package Q10;

import java.io.File;

public class Q10_01 {

	public static void main(String[] args) {
		String Sample_url="D:\\_Java\\workspace\\Java_Q\\Q10_Sample.txt";
//<JavaIO>------------------------------------------------
			File f1 = new File(Sample_url);
			System.out.println("f1的路徑為:"+Sample_url);
			System.out.println("F1是否為目錄:"+f1.isDirectory());
			System.out.println("F1是否為檔案:"+f1.isFile());
			System.out.println("F1是否為存在:"+f1.exists());
			System.out.println("F1大小為 "+f1.length()+" bytes");
			
	}

}
