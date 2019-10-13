import java.sql.*;


public class DBhelper extends Thread {
    private static final String url = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String username = "root";
    private static final String passwordname = "root";
    private Connection cn = null;
    private Statement statement=null;
    Humans humans=null;

    public DBhelper() {

    }

    public void run(){

        try {
            cn=DriverManager.getConnection(url,username,passwordname);
            statement=cn.createStatement();

            //statement.execute("INSERT INTO world.humans(name, surname) VALUES ('Ludmila','Truhanovich');");//вставка

           // statement.executeUpdate("Update `humans` set surname='Pety' where id=16;");//апдейт данных в таблице
//
//            statement.execute("SELECT*FROM world.humans VALUE WHERE surname='Chueshov'");


            ResultSet rs=statement.executeQuery("SELECT*FROM humans"); //Executequery позволяет делать только селекты через резол сет
    //        ArrayList<String>list=new ArrayList<String>(); arraylist add in result set for receive values out database
            while (rs.next()){
                humans=new Humans();
                humans.setId(rs.getInt("id"));
                humans.setName(rs.getString("name"));
                humans.setSurname(rs.getString("surname"));
                System.out.println(humans);
            }
           /* while (rs.next()){
            humans=new Humans();
           System.out.println(rs.getString("surname")); //получение данных с таблицы по колонке surname
                }*/

            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}