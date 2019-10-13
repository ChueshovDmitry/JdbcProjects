import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
//
//        try {
//            FileWriter fileWriter=new FileWriter("C://c.txt");
//            for (int i=0;i<=10;i++){
//                fileWriter.write(Integer.toString(i));
//            }

//
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        Humans hm=new Humans();
      DBhelper dBhelper=new DBhelper();
      dBhelper.start();





    }
}
