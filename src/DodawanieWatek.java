
import java.sql.ResultSet;
import java.sql.Statement;

/**
*
* @author Janusz Bonisławski
*/

/**
* Klasa Wątek dodaje oceny do bazy danych
*/
public class DodawanieWatek extends Thread{
    LogWindow.DB db;
    String queryString;
    Statement statement;
    int id,ucz,prz;
    String oc;
/**
* Konstruktor nadający wartości potrzebne do dodania oceny
*/
    DodawanieWatek(int a, int b, int c, String s ){
        id=a;
        ucz=b;
        prz=c;
        oc=s;
    }
/**
* Metoda dodająca oceny
*/
    public void run() {
        try{
                     queryString = "INSERT INTO Oceny (ID, IDUczen, IDPrzedmiot, Ocena) VALUES ("
                             +id+","
                             + ucz+","
                             + prz+",'"
                             + oc+"')";
                     db.statement.executeUpdate(queryString);   
                     
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
