 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.catur;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game papan = new Game();
        
        Piece pion = new Pawn("White", 4, 3);
        Piece benteng = new Fort("Black", 3, 3);
        Piece kuda = new Knight("Black", 7, 4);
        
        papan.addPiece(pion);
        papan.addPiece(benteng);
        papan.addPiece(kuda);
        
        papan.printBoardAwal();
        
        papan.movePiece(pion, 5, 3);
        papan.movePiece(benteng, 4, 4);
        papan.movePiece(kuda, 5, 5);
        
        papan.printBoardAkhir();
    }
    
}
