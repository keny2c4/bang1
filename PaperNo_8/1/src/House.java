/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minhk
 */
public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if(type.length() <= 3) return new StringBuilder(type).reverse().toString();
        else{
            String a = type.substring(type.length()-3);
            return new StringBuilder(a).reverse().toString();
        }
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area*3;
    }
    
    
}
