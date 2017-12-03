/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gracenotesports;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ding
 */
public class GracenoteSports {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<Data> dataList;
    
    public GracenoteSports() {
        // TODO code application logic here     
              dataList=new ArrayList();   
              extractCSVToList(); // Intial the CSV data into datalist
    }
    
    // Initial value of each data's item 
    private static Data initalData(String dataItem[]){
        
        Data data=null;
        data=new Data(dataItem[0],dataItem[1],dataItem[2],dataItem[3],dataItem[4],dataItem[5],dataItem[6],dataItem[7],dataItem[8],dataItem[9],dataItem[10],dataItem[11],dataItem[12],dataItem[13],dataItem[14],dataItem[15],dataItem[16],dataItem[17],dataItem[18]);
        return data;
    }
    
    // extract and parse the  data from  Dataset2roundsEredivie20172018.csv into datalist
    private static void extractCSVToList(){
              
            try { 
                BufferedReader reader = new BufferedReader(new FileReader("./src/gracenotesports/Dataset2roundsEredivie20172018.csv"));
                reader.readLine();
                String line = null; 
                while((line=reader.readLine())!=null){ 
                    String item[] = line.split("，");                   
                    String dataLine = item[item.length-1];                    
                    String dataItems[] = dataLine.split(",");
                    Data data=initalData(dataItems);
                    dataList.add(data);
                } 
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
        
    }
    
    // get the Initialed datalist
    public static ArrayList<Data> getDataList(){
        return dataList;
    }
    
}
