package work4;

import java.util.HashMap;

/**
 * A factory that generates graphic objects without allocating redundant images
 */
public class GraphicObjectFactory {

    /**
     * Cache that contains all previously loaded images
     */
    private HashMap<String, Image> loadedImages;

    /**
     * Constructor that initializes the empty cache
     */
    GraphicObjectFactory() {
        this.loadedImages = new HashMap<>();
    }

    /**
     * A method to create the new graphic object
     * @param imagePath THe path that is associated with the source image
     * @param x The X coordinate of the object you want to create
     * @param y Where on Y the object should be
     */
    public GraphicObject create(String imagePath, int x, int y) {

        if(loadedImages.containsKey(imagePath)) {
            Image image = loadedImages.get(imagePath);
            return new GraphicObject(image, x, y);
        }


        // load a new image
        Image image = new Image(new Point[5][6]);
        loadedImages.put(imagePath, image);
        return new GraphicObject(image, x, y);
    }

}
