
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janusz
 */
public class NauczycielOdswiezWatek extends Thread{
    LogWindow.DB db;
    String queryString;
    Statement statement;
    int id,ucz,prz;
    String oc;
    NauczycielOdswiezWatek(int a, int b, int c, String s ){
        id=a;
        ucz=b;
        prz=c;
        oc=s;
    }
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
