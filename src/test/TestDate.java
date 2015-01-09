package test;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guojiang on 2015/1/7.
 */
public class TestDate {



    public static void main(String[] args){

        TestDate service = new TestDate();
        Date date = new Date();

        String s = service.formatDate(date);
        System.out.println(s);
    }

    private String formatDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String dateString = format.format(date);
        return dateString;
    }


    private int writeFile(String fileName) {
        FileWriter fileWriter = null;
        return 0;
    }

    private void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            String s = null;
            while((s = br.readLine()) != null){
                s = br.readLine();
                System.out.println(s);
            }
            br.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
