/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catur;

/**
 *
 * @author Lenovo
 */
public class Knight extends Piece{
    
    public Knight(String color, int x, int y){
        super(color, x, y);
    }
    
    boolean isValidMove(int stepx, int stepy ){
        if ((stepx == 2 || stepx == -2) && (stepy == 1 || stepy == -1)){
            return true;
        }
        else if ((stepy == 2 || stepy == -2) && (stepx == 1 || stepx == -1)){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean move(int x, int y){
        if (isValidMove(x - getPosX(), y - getPosY())){
            return super.move(x, y);
        }
        else {
            return false;
        }
    }
    
@Override
    public String toString(){
        return "[Knight/" + color + "]";
    }
}

