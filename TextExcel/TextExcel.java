

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{
public static final int COLLUMS = 12;
public static final int ROWS = 20;


	public static void main(String[] args)
	{
       TestsALL.Helper th = new TestsALL.Helper();
       System.out.println(th.getText());
       
	    Scanner scan = new Scanner(System.in);
       Spreadsheet spreadSheetOne = new Spreadsheet();     //spreadsheet initialization
      
       while (!scan.equals ("quit")) {
       System.out.println("Enter a command: ");
       String command = scan.nextLine();
       System.out.println(spreadSheetOne.processCommand(command));
       }
	}
}
