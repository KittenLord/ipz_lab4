package work4;

/**
 * The class that contains the entry point
 */
public class Main {

    /**
     * The entry point of the program
     */
    public static void main(String[] args) {

        GraphicObjectFactory gofactory = new GraphicObjectFactory();

        String imageAPath = "./very_cool_image.png";
        GraphicObject a1 = gofactory.create(imageAPath, 1, 1);
        GraphicObject a2 = gofactory.create(imageAPath, 2, 5);
        GraphicObject a3 = gofactory.create(imageAPath, 8, 3);

        String imageBPath = "./another_very_cool_image.png";
        GraphicObject b1 = gofactory.create(imageBPath, 3, 3);
        GraphicObject b2 = gofactory.create(imageBPath, 7, 2);

        a2.edit(3, 4, new Point((byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF));
        b1.edit(1, 1, new Point((byte)0x00, (byte)0x00, (byte)0xFF, (byte)0xFF));

        a1.draw();
        a2.draw();
        a3.draw();
        b1.draw();
        b2.draw();
    }

}
