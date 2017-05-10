/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objbyrefval;

/**
 *
 * @author kms080
 */
public class ObjByRefVal {

   
    public static void main(String[] args) {
        oop o1 = new oop(1);
        oop o2 = new oop(2);
        System.out.println(o1 + "  " + o2);
        swapObjects(o1, o2);
        System.out.println(o1 + "  " + o2);
        changeProperty(o1);
        System.out.println(o1 + "  " + o2);
        o1 = changeObjectAndReturn(o2);
        System.out.println(o1 + "  " + o2);
             
        
        
    }
    public static void swapObjects(oop oo1, oop oo2){
        oop t;
        t = oo1;
        oo1 = oo2;
        oo2 = t;
    }
    public static void changeProperty(oop o){
        o.setX(200);
    }
    public static oop changeObjectAndReturn(oop o){
        o.setX(100);
        return o;
    }
}

class oop{
    private int x;
    public oop(int X){
        x = X;
    }
    public void setX(int X){
        x = X;
    }
    public String toString(){
        return(""+ x);
    }
}