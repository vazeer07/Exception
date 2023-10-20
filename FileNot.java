package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//FileNotFoundException
public class FileNot {
	public static void main(String[] args) throws IOException    {
		File f1=new File("C:\\Users\\pc\\Desktop\\name.txt");
		//FileInputStream fs = new FileInputStream(f1);
		FileReader fr=new FileReader(f1);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		
	}
}
