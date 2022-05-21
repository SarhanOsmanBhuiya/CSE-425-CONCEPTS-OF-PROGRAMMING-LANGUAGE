/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Farjana
 */

public class Barcelona {
    public static void main(String[]args) throws FileNotFoundException{
        
        
        Scanner s=new Scanner(System.in);
        System.out.println("1.Search by Station\n2.Search by Date\n3.Search By Time\nEnter your choices");
        int choice=s.nextInt();
        if (choice==1){
            SearchByStation();
        }else if(choice==2){
            SearchByDate();
        }else if (choice==3){
            SearchByTime();
        }else{
            System.out.println("Invalid input");
        }

}

    private static void SearchByStation() {
        String fileName="air_quality_Nov2017.csv";
        File file = new File(fileName);
        try{
            Scanner s=new Scanner(System.in);
            String station=s.nextLine()+'"';
            Scanner inputStream = new Scanner (file);
            inputStream.next();
            while(inputStream.hasNext()){
            String data = inputStream.nextLine();
       
         
            String [] values = data.split(",");
            if(values[0].endsWith(station)){
                for(int i=0;i<=14;i++){
                    System.out.print(values[i]);
                 }
                System.out.println();
       }
           
    }
    inputStream.close();
}catch(FileNotFoundException e){
    System.out.println("An error has been occured.Please check your data file directory.");
}
    }

    private static void SearchByDate() {
        String fileName="air_quality_Nov2017.csv";
        File file = new File(fileName);
        try{
            Scanner s=new Scanner(System.in);
            String Date='"'+s.nextLine();
            Scanner inputStream = new Scanner (file);
            inputStream.next();
            while(inputStream.hasNext()){
                String data = inputStream.nextLine();
                String [] values = data.split(",");
                if(values[13].startsWith(Date)){
                    for(int i=0;i<=14;i++){
                    System.out.print(values[i]);
                }
                    System.out.println();
                }
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("An error has been occured.Please check your data file directory.");   
        }
    }
    
    private static void SearchByTime() {
        String fileName="air_quality_Nov2017.csv";
        File file = new File(fileName);
        try{
            Scanner s=new Scanner(System.in);
            String time=s.nextLine()+'"';
     
            Scanner inputStream = new Scanner (file);
            inputStream.next();
            while(inputStream.hasNext()){
            String data = inputStream.nextLine();
       
         
            String [] values = data.split(",");
            if(values[13].endsWith(time)){
                for(int i=0;i<=14;i++){
                    System.out.print(values[i]);
                }
                System.out.println();
       }
           
    }
    inputStream.close();
}catch(FileNotFoundException e){
    System.out.println("An error has been occured.Please check your data file directory.");
}
    }
}