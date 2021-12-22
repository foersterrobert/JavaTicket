import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.*;
import javax.swing.*;

public class javaEnemy extends JPanel{
    public static final int UNIT_SIZE = 50;
    int[] cellspathColumn;
    int[] cellspathRow;
    int positionColumn = 500;
    int positionRow = 500;

    String javaIconPath = "assets/java_logo.png";


    public javaEnemy() throws IOException{
        System.out.println("Created javaEnemy");
        cellspathColumn = board.cellspathColumn;
        cellspathRow = board.cellspathRow;
    }

    /*/
    public void draw(Graphics g){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image javaIcon = tk.getImage(javaIconPath);
        g.drawImage(javaIcon, 200, 200, (ImageObserver) this);
        g.setColor(Color.GREEN);
        for (int i = 0; i < cellspathColumn.length; i++){
            //g.fillRect(cellspathColumn[i] * UNIT_SIZE, cellspathRow[i] * UNIT_SIZE, 80, 80);
            positionColumn = cellspathColumn[i] * UNIT_SIZE;
            positionRow = cellspathRow[i] * UNIT_SIZE;
            
            for (int j = 0; j < UNIT_SIZE; j++) {
                positionColumn++;
                positionRow++;
                System.out.println("Column: "+positionColumn+"  positionRow: "+positionRow);
                g.fillRect(positionColumn, positionRow, 30, 30);
            }
        }*/ // Stacked sich falsch
    }
}
