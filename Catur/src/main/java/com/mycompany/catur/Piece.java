/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catur;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Piece {
    Piece[][] board = new Piece[8][8]; 
    String color;
    int positionX;
    int positionY;
    
    public Piece(String color, int x, int y){
        this.color = color;
        this.positionX = 0;
        this.positionY = 0;
        
        if (1 <= x && x <= 8) {
            this.positionX = x; 
        } 
        if (1 <= y && y <= 8) {
            this.positionY = y;
        }
    }
    
    public void setX(int x){
        setPosition(x,this.positionY);
    }
    
    public void setY(int y){
        setPosition(this.positionX, y);
    }
    
    public boolean setPosition(int x, int y){
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
    
    public boolean move(int x, int y){
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
  
    
    public int getPosX(){
        return positionX;
    }
    
    public int getPosY(){
        return positionY;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return "[Piece/" + color + "]";
    }
}
