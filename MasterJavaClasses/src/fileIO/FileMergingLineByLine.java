package fileIO;
import java.io.*;
public class FileMergingLineByLine {

	//This code will merge text from 2files into 1 where merging will be done line by line
	public static void main(String[] args) throws Exception {
		
		File f1 = new File("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\file1.txt");
		File f2 = new File("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\file2.txt");
		File target = new File("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\target.txt");
		target.createNewFile();
		
		//Below line will be used to write output to target file
		PrintWriter pw = new PrintWriter(target);
		BufferedReader br1 = new BufferedReader(new FileReader(f1));
		BufferedReader br2 = new BufferedReader(new FileReader(f2));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1!=null || line2!=null)
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1 = br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2= br2.readLine();
			}
			
		}
		
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		
	}

}
