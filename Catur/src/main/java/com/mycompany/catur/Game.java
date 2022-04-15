/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catur;

/**
 *
 * @author Lenovo
 */
public class Game{
    private Piece[][] board;
    
    public Game(){
        this.board = new Piece[8][8];
    }
    
    public Piece[][] getBoard(){
        return board;
    }
    
    public boolean addPiece(Piece p){
        if (board[p.getPosX() -1][p.getPosY()-1] == null){
            board[p.getPosX() -1][p.getPosY()-1] = p;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void movePiece(Piece p, int x, int y){
        int oldX = p.getPosX();
        int oldY = p.getPosY();
        
        if (p.move(x, y)){
            board[oldX - 1][oldY - 1] = null;
            board[p.getPosX()-1][p.getPosY()-1] = p;
        }
    }
    
    public void printBoardAwal(){
        System.out.println("Letak Piece pada papan awal: ");
        for (int i = 0; i < 8; i++){
            for (int j = 0; j<8; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    
    public void printBoardAkhir(){
        System.out.println("Letak Piece pada papan akhir: ");
        for (int i = 0; i < 8; i++){
            for (int j = 0; j<8; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }
}

