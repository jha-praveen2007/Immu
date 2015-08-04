/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package immu;

/**
 *
 * @author pjha
 */
public class Immu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HasA ha = new HasA(1, "First Hash");
        Base bas = new Base(1, "FirstBase", ha);
        System.out.println(bas);
        
        HasA tmp = bas.getHashA();
        
        System.out.println(bas);
        
    }
}
