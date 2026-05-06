package Day_12;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reverseFileContent {
	public static void main(String[] args)
	{
		String filepath="sample.txt";
		try
		{
			FileReader reader=new FileReader(filepath);
			StringBuilder content=new StringBuilder();
			int ch;
			while((ch=reader.read())!=-1)
			{
				content.append((char) ch);
			}
			reader.close();
			content.reverse();
			FileWriter writer=new FileWriter(filepath);
			writer.write(content.toString());
			writer.close();
			System.out.println("File content reversed successfully!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
