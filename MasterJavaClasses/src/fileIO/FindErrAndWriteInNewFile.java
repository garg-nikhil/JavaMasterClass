package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FindErrAndWriteInNewFile {

	public static void main(String[] args) throws Exception {
		
		File ErrorLog = new File("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\ErrorLog.txt");
		BufferedReader br = new BufferedReader(new FileReader(ErrorLog));
		
		PrintWriter pw = new PrintWriter("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\Output.txt");
		
		String line = br.readLine();
		
		while(line!=null)
		{
			if (line!=null)
			{ 
			if(line.contains("Error") || line.contains("error"))
			{
				pw.println(line);
			}
			}
			line = br.readLine();
		}
		
		pw.flush();
		br.close();
		pw.close();
		
	}

}
