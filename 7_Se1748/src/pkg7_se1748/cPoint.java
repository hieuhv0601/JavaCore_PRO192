/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_se1748;

/**
 *
 * @author HieuSA
 */
public class cPoint {
    private int x;
    private int y;
    public cPoint() {
    }

    public cPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "cPoint{" + "x=" + x + ", y=" + y + '}';
    }

    
    
}