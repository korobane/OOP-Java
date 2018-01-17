package kiev.course.koroban.dz2;

import java.util.Arrays;

/**
 * Created by Elena on 17.01.2018.
 */
public class Board {
    private Shape[] boardShapes;

    public Board() {
        boardShapes  = new Shape[4] ;
    }

    public void putShapeOnBoard(Shape a,int index){
    if (boardShapes[index]==null)
        boardShapes[index]=a;
    else
        System.out.println("Index " + index + " is not empty on the board!!!");
    }

    public void putShapeOnBoardFreeSpace(Shape a){
        for (int i = 0; i < boardShapes.length; i++) {
            if (boardShapes[i]==null){
                boardShapes[i] = a;
                return;
            }
        }
        System.out.println("Doesn't exists free space on the board!");
    }
    public void deleteShape(int index){
        if (boardShapes[index]!=null)
            boardShapes[index]=null;
        else
            System.out.println("Board doesn't contain shape with index "+ index);
    }

    @Override
    public String toString() {
        double areaShape = 0.0;
        for (int i = 0; i < boardShapes.length; i++) {
            if (boardShapes[i]!=null){
                areaShape = areaShape + boardShapes[i].getArea();
            }
        }

        return "Board{" +
                "boardShapes=" + Arrays.toString(boardShapes) +
                ", sum areas of shapes are: " + areaShape +
                '}';
    }
}
