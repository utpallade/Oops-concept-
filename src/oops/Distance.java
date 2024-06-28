package oops;

public class Distance {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distance;

    
    public Distance() {
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y2 = 0.0;
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));;
    }

    
    public Distance(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        calculateDistance();
    }

    
    private void calculateDistance() {
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    
    public double getDistance() {
        return distance;
    }

    public static void main(String[] args) {
        
        Distance distance1 = new Distance();
        Distance distance2 = new Distance(1.0, 2.0, 4.0, 6.0); 

        
        System.out.println("Distance 1: " + distance1.getDistance());
        System.out.println("Distance 2: " + distance2.getDistance());
    }
}