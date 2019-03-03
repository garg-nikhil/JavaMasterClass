package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchingPatternInFile {
	File Source = new File("C:\\Users\\Nikhil\\Desktop\\Java\\Sample files\\Source.txt");

	public void Find() throws IOException {
		
		Source.createNewFile();
		PrintWriter pw = new PrintWriter(Source);
		pw.println("ABC");
		pw.println("Def");
		pw.flush();
		pw.close();
}
	
	public void Verify() throws Exception {
		
		BufferedReader bw = new BufferedReader(new FileReader(Source));
		String line = bw.readLine();
		
		while(line!=null) 
		{
			if(line.contains("AD")) 
			{
				System.out.println("Pattern found");
				break;
			}
			else
				System.out.println("Empty file");
			
			line=bw.readLine();
			
		}
		
		bw.close();
}
	public static void main(String[] args) throws Exception {
		
		SearchingPatternInFile a = new SearchingPatternInFile();
		a.Find();
		a.Verify();
	
	}

}
