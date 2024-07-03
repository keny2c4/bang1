/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minhk
 */
public class SpecLift extends Lift{
    private int load;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return label+","+load+","+type;
    }
    public void setData(){
        StringBuilder u1 = new StringBuilder();
        String c1 = getLabel();
        
        for (int i = 0; i < c1.length(); i++) {
            if (i % 2 == 0) {
                u1.append(c1.charAt(i));
            }
        }
        setLabel(u1.toString());
    }
    public int getValue(){
        if(!getLabel().contains(String.valueOf(getType()))) return load;
        
        return load + type;
    }
    
}
