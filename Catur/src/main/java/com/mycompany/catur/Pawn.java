/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catur;

/**
 *
 * @author Lenovo
 */
public class Pawn extends Piece{
    
    public Pawn(String color, int x, int y){
        super(color, x, y);
    }
    
    @Override
    public boolean move(int x, int y){
        setY(getPosY() + 1);
        if (1 <= x && x <=8 && 1 <= y && y <=8){
            if (1 <= x && x <=8){
                this.positionX = x;
            }
        
            if (1 <= y && y <=8){
                this.positionY = y;
            }
            return true;
        }
        else {
            return false;
        }
    }
    
@Override
    public String toString(){
        return "[Pawn/" + color + "]";
    }
}
