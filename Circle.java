package kiev.course.koroban.dz2;

/**
 * Created by Elena on 17.01.2018.
 */
public class Circle extends Shape {
    private Point centerPoint;
    private Point radiusPoint;
    private double radius;


    public Circle(Point centerPoint, Point radiusPoint) {
        this.centerPoint = centerPoint;
        this.radiusPoint = radiusPoint;
        radius = Distance.getDistance(centerPoint, radiusPoint);
        nameOfShape = "Circle";
    }

    public Circle() {
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getRadiusPoint() {
        return radiusPoint;
    }

    public void setRadiusPoint(Point radiusPoint) {
        this.radiusPoint = radiusPoint;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimetr(){
       if (centerPoint != null&&radiusPoint!=null){
           return 2.0 * Math.PI * radius;
       }
        System.out.println("Can not be calculated");
      return 0.0;
    }

    public double getArea(){
      if (centerPoint != null&&radiusPoint!=null) {
          return Math.PI * Math.pow(radius,2.0);
      }
        System.out.println("Can not be calculated");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerPoint=" + centerPoint +
                ", radiusPoint=" + radiusPoint +
                ", radius=" + radius +
                ", circleArea=" + getArea() +
                '}';
    }
}
