package kiev.course.koroban.dz2;

/**
 * Created by Elena on 17.01.2018.
 */
public class Quadrilateral extends Shape {
    private Point cornerA;
    private Point cornerB;
    private Point cornerC;
    private Point cornerD;
    private double sideAB;
    private double sideBC;
    private double sideCD;
    private double sideAD;

    public Quadrilateral(Point cornerA, Point cornerB, Point cornerC, Point cornerD) {
        this.cornerA = cornerA;
        this.cornerB = cornerB;
        this.cornerC = cornerC;
        this.cornerD = cornerD;
        sideAB = Distance.getDistance(cornerA, cornerB);
        sideBC = Distance.getDistance(cornerB, cornerC);
        sideCD = Distance.getDistance(cornerC, cornerD);
        sideAD = Distance.getDistance(cornerD, cornerA);
        nameOfShape = "Quadrilateral";
    }

    public Quadrilateral() {
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

    public Point getCornerD() {
        return cornerD;
    }

    public void setCornerD(Point cornerD) {
        this.cornerD = cornerD;
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideCD() {
        return sideCD;
    }

    public double getSideAD() {
        return sideAD;
    }

    public double getPerimetr() {
        if (cornerA!=null&&cornerB!=null&&cornerC!=null&&cornerD!=null) {
            return sideAB+sideAD+sideBC+sideCD;
        }
        return 0.0;
    }

    public double getArea() {
        if (cornerA!=null&&cornerB!=null&&cornerC!=null&&cornerD!=null) {
            double halfPerimetr = getPerimetr() / 2.0;
            return Math.sqrt((halfPerimetr - sideAB) * (halfPerimetr - sideBC) * (halfPerimetr - sideCD) * (halfPerimetr - sideAD));
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "cornerA=" + cornerA +
                ", cornerB=" + cornerB +
                ", cornerC=" + cornerC +
                ", cornerD=" + cornerD +
                + sideAB +" " + sideBC + " " + sideCD + " " + sideAD +
                ", Quadrilateral area=" + getArea() +
                '}';
    }
}
