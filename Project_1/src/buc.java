import java.util.*;
import java.io.*;
public class buc {

	
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("What is your name:  ");
		String nam = br.readLine();
		
		System.out.println("What is your dateofbirth:  ");
		int dob = Integer.parseInt(br.readLine());
				
		System.out.print("What is currentyear:  ");
		int curyr = Integer.parseInt(br.readLine());
		
		System.out.println("Welcome "+nam+". You are "+(curyr-dob));
		System.out.println("Please come again and again");
		 

	}

}
