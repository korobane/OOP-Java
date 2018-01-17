package kiev.course.koroban.dz2;

/**
 * Created by Elena on 17.01.2018.
 */
public class Distance {
   public static final double getDistance(Point a, Point b){
       return Math.sqrt( Math.pow((a.getX() - b.getX()),2.0) +  Math.pow((a.getY() - b.getY()),2.0) );
   }
}
