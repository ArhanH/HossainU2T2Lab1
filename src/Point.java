public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor = both variables
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor = one variable
    public Point(int dot) {
        x = dot;
        y = dot;
    }

    // constructor = no variable
    public Point() {
        x = 0;
        y = 0;
    }

    // getter x
    public int getX() {
        return x;
    }

    // getter y
    public int getY() {
        return y;
    }

    // setter x
    public void setX(int newX) {
        x = newX;
    }

    // setter y
    public void setY(int newY) {
        y = newY;
    }

    // coordinate method
    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    // quadrant method
    public String quadrant() {
        if (x > 0 && y > 0) {
            return "Quadrant I";
        }
        if (x < 0 && y < 0) {
            return "Quadrant III";
        }
        if (x > 0 && y < 0) {
            return "Quadrant IV";
        }
        if (x < 0 && y > 0){
            return "Quadrant II";
        }
        if (x == 0 && y == 0){
            return "Origin";
        }
        if (x > 0 && y == 0){
         return "Axis";
        }
        if (x < 0 && y == 0){
            return "Axis";
        }
        if (x == 0 && y > 0){
            return "Axis";
        }
        if (x == 0 && y < 0){
            return "Axis";
        }
        return quadrant();
    }
}

