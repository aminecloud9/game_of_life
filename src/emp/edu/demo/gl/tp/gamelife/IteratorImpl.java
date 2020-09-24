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
public class IteratorImpl implements Iterator{
    private int index ;
    private List list ;
    public IteratorImpl(List list) {
    this .list = list;
   }
    public boolean hasNext() {
    return index < list .size();
}
public Object next() {
Object element = null ;
if (index < list .size()) {
element = list .get(index );
   index ++;
   }
   return element;
}
}
