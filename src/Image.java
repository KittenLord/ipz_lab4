package work4;

/**
 * The class that contains raw image data
 */
public class Image implements Drawable {

    /**
     * Static created image counter for testing purposes
     */
    private static int createdImages = 0;

    /**
     * Pixel data of the image
     */
    private Point[][] pixels;

    /**
     * Amount of columns
     */
    private int cols;

    /**
     * Amount of rows
     */
    private int rows;

    /**
     * Getter of columns
     */
    public int getCols() { return cols; }

    /**
     * Getter of rows
     */
    public int getRows() { return rows; }

    /**
     * A constructor of the image
     * @param pixels Data of the image
     */
    public Image(Point[][] pixels) {
        this.pixels = pixels;
        rows = pixels.length;
        cols = pixels[0].length;

        createdImages++;
        System.out.println("A new image has been created");
        System.out.println("Now there are " + createdImages + " images");
    }

    /**
     * Draw method that draws the image at the coordinates
     * @param x X coordinate
     * @param y Coordinate of Y
     */
    public void draw(int x, int y) {
        System.out.println("An image has been drawn");
    }

}
