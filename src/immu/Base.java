/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package immu;

/**
 *
 * @author pjha
 */
public final class Base {
    private int id1;
    private String name;
    final private HasA hashA;

    public Base(int id, String name, HasA hashA) {
        this.id1 = id;
        this.name = name;
        this.hashA = hashA;
    }

    public int getId() {
        return id1;
    }

    public String getName() {
        return name;
    }

    public HasA getHashA() {
        return hashA;
    }
    
    public String toString() {
        return "{Base(id:"+id1+";name:"+name+";hashA:"+hashA.toString()+")}";
    }
    
    
}
