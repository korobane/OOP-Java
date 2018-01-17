package kiev.course.koroban.dz2;

/**
 * Created by Elena on 17.01.2018.
 */
public class Main {
    public static void main(String[] args) {

        Circle circleOne = new Circle(new Point(1.0,1.0), new Point(1.0,3.0));
        Triangular  triangularOne = new Triangular(new Point(1.0,1.0),new Point(3.0,4.0),new Point(5.0,2.0 ));
        Quadrilateral rectangle = new Quadrilateral(new Point(1.0, 1.0), new Point(1.0, 4.0), new Point(4.0, 4.0), new Point(4.0, 1.0));
        Circle circleTwo = new Circle(new Point(1.0,3.0), new Point(1.0,1.0));
        Board boardOne = new Board();

        boardOne.putShapeOnBoardFreeSpace(circleOne);
        System.out.println(boardOne);
        boardOne.putShapeOnBoard(triangularOne,3);

        boardOne.putShapeOnBoard(circleTwo,3);

        boardOne.putShapeOnBoardFreeSpace(rectangle);

        System.out.println(boardOne);
        boardOne.deleteShape(3);
        System.out.println(boardOne);

    }
}
