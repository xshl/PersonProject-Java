
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * ���ļ��ж�ȡ�ַ�����
 */
public class charCount {
	public static int charcount(File file) {
		BufferedReader reader = null;
		int charcount = 0;
		int value = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((value = reader.read()) != -1) {
				if (value >= 0 && value<=255) {// �ж��Ƿ�����ascill��
					charcount++;
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return charcount;
	}
}
