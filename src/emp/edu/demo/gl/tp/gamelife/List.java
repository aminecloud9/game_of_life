/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp.edu.demo.gl.tp.gamelife;

/**
 *
 * @author TAKI_DJ
 */
public interface List {
    public void add(Object element);
    public void delete();
    public Object get(int index);
    public int size();
    public Iterator iterator();
}
