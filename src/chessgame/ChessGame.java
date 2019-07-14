package chessgame;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ChessGame {

    public static void main(String[] args) throws IOException{
        JFrame frame = buildFrame();
        
        // Chess Board Image
        final BufferedImage chessBoard = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\ChessBoard.png"));
        // White Pieces Images
        final BufferedImage pawnW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\Pawn_White.png"));
        final BufferedImage rookW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\Rook_White.png"));
        final BufferedImage knightW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\Knight_White.png"));
        final BufferedImage bishopW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\Bishop_White.png"));
        final BufferedImage queenW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\Queen_White.png"));
        final BufferedImage kingW = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\WhitePieces\\King_White.png"));
        // Black Pieces Images
        final BufferedImage pawnB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\Pawn_Black.png"));
        final BufferedImage rookB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\Rook_Black.png"));
        final BufferedImage knightB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\Knight_Black.png"));
        final BufferedImage bishopB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\Bishop_Black.png"));
        final BufferedImage queenB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\Queen_Black.png"));
        final BufferedImage kingB = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\BlackPieces\\King_Black.png"));
        // Placement and Selection Images
        final BufferedImage selection = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\Selection.png"));
        final BufferedImage placement = ImageIO.read(new File("C:\\Users\\kingc\\Documents\\NetBeansProjects\\ChessGame\\src\\chessgame\\Placement.png"));
        
        JPanel setupBoard = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);

                // Draw Board
                g.drawImage(chessBoard, 0, 0, null);
                
                // Draw Black Pawns - Second Row From Top
                for (int i = 50; i < 800; i+= 100){
                    g.drawImage(pawnB, i, 150, null);    
                }
                // Draw Black Mains
                g.drawImage(rookB, 50, 50, null);    
                g.drawImage(knightB, 150, 50, null);    
                g.drawImage(bishopB, 250, 50, null);    
                g.drawImage(kingB, 350, 50, null);    
                g.drawImage(queenB, 450, 50, null);    
                g.drawImage(bishopB, 550, 50, null);    
                g.drawImage(knightB, 650, 50, null);    
                g.drawImage(rookB, 750, 50, null);    

                // Draw White Pawns
                for (int i = 50; i < 800; i+= 100){
                    g.drawImage(pawnW, i, 650, null);    
                }
                // Draw White Mains
                g.drawImage(rookW, 50, 750, null);    
                g.drawImage(knightW, 150, 750, null);    
                g.drawImage(bishopW, 250, 750, null);    
                g.drawImage(kingW, 350, 750, null);    
                g.drawImage(queenW, 450, 750, null);    
                g.drawImage(bishopW, 550, 750, null);    
                g.drawImage(knightW, 650, 750, null);    
                g.drawImage(rookW, 750, 750, null);    
                
            }//end paintComponent
        };
        frame.add(setupBoard);
    
    }//end main
    
    private static JFrame buildFrame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Play Chess");
        frame.setResizable(false);
        frame.setSize(905, 930);
        frame.setVisible(true);
        
        return frame;
    }//end buildFrame
  
}//end ChessGame
