import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

public class AreaOfTriangle {
    public double areaCalculate(double aX, double aY, double bX, double bY, double cX, double cY) {
        double area = 0;
        double ab, bc, ac;
        ab = sqrt((bX - aX) * (bX - aX) + (bY - aY) * (bY - aY));
        bc = sqrt((cX - bX) * (cX - bX) + (cY - bY) * (cY - bY));
        ac = sqrt((cX - aX) * (cX - aX) + (cY - aY) * (cY - aY));
        if (ab + bc > ac && bc + ac > ab && ac + ab > bc) {
            area = abs((bX - aX) * (cY - aY) - (cX - aX) * (bY - aY)) / 2;
        }
        return area;
    }
}
