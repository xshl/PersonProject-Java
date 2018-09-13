
import java.io.File;
import java.util.Scanner;
/*
 * �����򣬿����������н��ܲ���
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		File file = new File(path);
		if (!file.exists()) {
			System.out.println(file + "�ļ�û���ҵ�");
			System.exit(0);
		}else if (!file.isFile()) {
			System.out.println("�ļ����쳣");
			System.exit(0);
		}else {
			
		}
		System.out.println("characters:" + charCount.charcount(file));
		System.out.println("words:" + wordCount.wordcount(file));
		System.out.println("lines:" + lineCount.linecount(file));
		File file1 = new File(".\\result.txt");
		if (file1.exists() && file1.isFile()) {
			file1.delete();
		}
		writeInTxt.writeTxt("characters:" + charCount.charcount(file));
		writeInTxt.writeTxt("words:" + wordCount.wordcount(file));
		writeInTxt.writeTxt("lines:" + lineCount.linecount(file));
		wordDetail.worddetail(file);
		scanner.close();
	}
}
