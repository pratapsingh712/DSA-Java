package basics;

public class TotaSurfaceAreaCuboid {
    public static void main(String[] args) {
        double length = 2.3;
        double breadth = 5.4;
        double height = 6.5;

        double v = length*breadth + breadth*height + length*height;

        double tsa = 2*v;

        System.out.println("Total surface area of cuboid is : "+tsa);

    }
}
