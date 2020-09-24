/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp.edu.demo.gl.tp.gamelife;

import java.util.Arrays;

/**
 *
 * @author TAKI_DJ
 */
public class ArrayList implements List{
    private int initCapacit = 200;
    private int size ;
    private Object[] elementData ;
    public ArrayList() {
        elementData = new Object[initCapacit ];
     }
@Override
public void add(Object element) {
        if (size < initCapacit ) {
              elementData [size ] = element;
              size ++;
         } else {
                elementData = Arrays.copyOf (elementData, size );
                elementData [size ] = element;
                size ++;
         } }
@Override
public Object get(int index) {
return elementData [index];
}
@Override
public int size() {
return size ; }
@Override
public Iterator iterator() {
return new IteratorImpl(this );
}

    @Override
    public void delete() {
        for(int i=0;i<size;i++)
        {
            elementData[i]=null;
        }
        size=0;
    }
}