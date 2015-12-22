/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author CHETAN
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al=new ArrayList<String>();
        al.add("Shalvi");
        al.add("Nupur");
        al.add("Monika");
        al.add("Nirali");
        
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("Shalvi");
        al1.add("Bhoomi");
        al1.add("Perlin");
        
        al.addAll(al1);
       // al.removeAll(al1);
        //al.retainAll(al1);
        
       
        Iterator itr=al.iterator();
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
    
}
