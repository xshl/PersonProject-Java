
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * 从文件中读取字符个数
 */
public class charCount {
	public static int charcount(File file) {
		BufferedReader reader = null;
		int charcount = 0;
		int value = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((value = reader.read()) != -1) {
				if (value >= 0 && value<=255) {// 判断是否属于ascill码
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
