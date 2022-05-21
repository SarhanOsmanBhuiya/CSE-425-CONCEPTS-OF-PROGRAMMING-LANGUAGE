package cse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "data.csv"; 
		File file = new File(fileName);
		Scanner reader = new Scanner(System.in); //2015-01-23T03:30:00.000Z
		Scanner read = new Scanner(System.in);
		System.out.println("Press 1 to search by day \n"+
							"Press 2 to search by month \n" +
							"Press 3 to search by year");
		int choice = read.nextInt();
		System.out.println(choice);
		if(choice == 1){
			System.out.println("Enter year(yyyy-mm-dd)"); //2015-02-01
		}
		else if(choice == 2){
			System.out.println("Enter month(yyyy-mm)"); //2015-02
		}
		else if(choice == 3){
			System.out.println("Enter month(yyyy)"); //2015
		}
		else{
			System.out.println("Not a valid number");
		}
		
		//System.out.println("Enter year");
		String n = reader.nextLine();
		reader.close();
		
		//System.out.println(number.nextLine());
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.next();
			inputStream.next();
			inputStream.next();
			inputStream.next();
			while(inputStream.hasNext()){
				String data = inputStream.nextLine(); // gets a whole line
				String[] values = data.split(",");
				//System.out.println(values[0]);
				if(values[0].contains(n)){
				//System.out.println(values[1]);
				System.out.println(values[0] + values[1] + values[2] + "***");
				}
			}
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
