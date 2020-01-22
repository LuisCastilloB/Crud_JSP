
package modelDAO;


import interfaces.Crud;
import java.util.List;
import model.Person;
import config.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonDAO implements Crud{

    ConnectDB cnx = new ConnectDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Person p = new Person();
    
    @Override
    public List toList() {
        ArrayList<Person>list = new ArrayList<>();
        String sql = "select * from person";
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Person per = new Person();
                per.setId(rs.getInt("id"));
                per.setDocument(rs.getString("document"));
                per.setName(rs.getString("name"));
                list.add(per);
            }
            
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Person list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Person per) {
        String sql = "insert into person (document,name) values ('"+per.getDocument()+"','"+per.getName()+"')";
        
        try {
            con = cnx.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
              
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Person per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
