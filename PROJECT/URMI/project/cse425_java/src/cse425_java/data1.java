package cse425_java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class data1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "data1.csv"; 
		File file = new File(fileName);
		Scanner reader = new Scanner(System.in); //2015-01-23T03:30:00.000Z
		Scanner read = new Scanner(System.in);
		System.out.println("Press 1 to search by year \n"+
							"Press 2 to search by state\n"+
							"Press 3 to search by deaths");
		int choice = read.nextInt();
		System.out.println(choice);
		if(choice == 1){
			System.out.println("Enter year(yyyy)");
		}
		else if(choice == 2){
			System.out.println("Enter State"); 
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





