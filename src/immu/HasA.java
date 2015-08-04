/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package immu;

/**
 *
 * @author pjha
 */
class HasA {
    private int hid;
    private String hname;

    public HasA(int hid, String hname) {
        this.hid = hid;
        this.hname = hname;
    }

    public int getHid() {
        return hid;
    }

   

    public String getHname() {
        return hname;
    }

    

    @Override
    public String toString() {
        return "{HasA(id:"+hid+";name:"+hname+";)}";
    }
    
    
}
