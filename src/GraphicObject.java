package work4;

/**
 * An object that is actually drawn, that contains a source image
 */
public class GraphicObject {

    /**
     * The X coordinate of the object
     */
    private int x;

    /**
     * The Y coordinate of the object
     */
    private int y;

    /**
     * The source of the object
     */
    private Image image;

    /**
     * The edits that are overlayed over the source image
     */
    private Point[][] edits;

    /**
     * The constructor
     * @param image The source image
     * @param x The X coordinate of the object
     * @param y WHere on the Y axis the object should be located
     * @return A new graphic object
     */
    GraphicObject(Image image, int x, int y) {
        this.image = image;
        this.edits = null;
    }

    /**
     * A method to draw the object (its source image and edits)
     */
    public void draw() {
        image.draw(x, y);


        if(edits == null) return;
        // draw the this.edits buffer above the image
        System.out.println("Draw edits");
    }

    /**
     * A method to edit the image
     * @param r The row of the pixel to be altered
     * @param c The column that contains the pixel that you want to change
     * @param point The color of the pixel that you want to set
     */
    public void edit(int r, int c, Point point) {

        if(edits == null) { edits = new Point[image.getCols()][image.getRows()]; }

        edits[r][c] = point;

    }

}
