package Q10;

import java.io.File;

public class Q10_01 {

	public static void main(String[] args) {
		String Sample_url="D:\\_Java\\workspace\\Java_Q\\Q10_Sample.txt";
//<JavaIO>------------------------------------------------
			File f1 = new File(Sample_url);
			System.out.println("f1�����|��:"+Sample_url);
			System.out.println("F1�O�_���ؿ�:"+f1.isDirectory());
			System.out.println("F1�O�_���ɮ�:"+f1.isFile());
			System.out.println("F1�O�_���s�b:"+f1.exists());
			System.out.println("F1�j�p�� "+f1.length()+" bytes");
			
	}

}
