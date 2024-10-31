package work4;

/**
 * The data of a single point
 */
public class Point {

    /**
     * The value of the red channel
     */
    public byte r;

    /**
     * The amount of green
     */
    public byte g;

    /**
     * How blue it is
     */
    public byte b;

    /**
     * How see-able the pixel is
     */
    public byte a;

    /**
     * Constructor of a single pixel
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param a Alpha
     */
    Point(byte r, byte g, byte b, byte a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

}
