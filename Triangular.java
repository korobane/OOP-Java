package kiev.course.koroban.dz2;

/**
 * Created by Elena on 17.01.2018.
 */
public class Triangular extends Shape{
    private Point cornerA;
    private Point cornerB;
    private Point cornerC;
    private double sideAB;
    private double sideBC;
    private double sideAC;

    public Triangular(Point cornerA, Point cornerB, Point cornerC) {
        this.cornerA = cornerA;
        this.cornerB = cornerB;
        this.cornerC = cornerC;
        sideAB = Distance.getDistance(cornerA, cornerB);
        sideBC = Distance.getDistance(cornerB, cornerC);
        sideAC = Distance.getDistance(cornerA, cornerC);
        nameOfShape = "Triangle";
    }

    public Triangular() {
    }

    public Point getCornerA() {
        return cornerA;
    }

    public void setCornerA(Point cornerA) {
        this.cornerA = cornerA;
    }

    public Point getCornerB() {
        return cornerB;
    }

    public void setCornerB(Point cornerB) {
        this.cornerB = cornerB;
    }

    public Point getCornerC() {
        return cornerC;
    }

    public void setCornerC(Point cornerC) {
        this.cornerC = cornerC;
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideAC() {
        return sideAC;
    }

    public double getArea() {
        if (cornerA!=null&&cornerB!=null&&cornerC!=null) {
            double halfPerimetr = getPerimetr()/2.0;
            return Math.sqrt(halfPerimetr * (halfPerimetr - sideAB) * (halfPerimetr - sideBC) * (halfPerimetr - sideAC) );
        }
        return 0.0;
    }


    public double getPerimetr() {
        if (cornerA!=null&&cornerB!=null&&cornerC!=null) {
            return sideAB + sideBC + sideAC;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Triangular{" +
                "cornerA=" + cornerA +
                ", cornerB=" + cornerB +
                ", cornerC=" + cornerC +
                ", Triangular area=" + getArea() +
                '}';
    }
}
