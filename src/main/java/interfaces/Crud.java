/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Person;
/**
 *
 * @author Pc
 */
public interface Crud {
    
    public List toList();
    
    public Person list(int id);
    public boolean add(Person per);
    public boolean edit(Person per);
    public boolean delete(int id);
    
}
