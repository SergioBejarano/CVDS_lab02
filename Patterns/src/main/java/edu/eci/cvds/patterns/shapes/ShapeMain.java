package edu.eci.cvds.patterns.shapes;

/**
 * The ShapeMain class contains the main method to run the application.
 * It handles command-line arguments to create a shape of a specified type
 * and then prints information about the created shape.
 */
public class ShapeMain {

    /**
     * The entry point of the application. It expects one command-line argument
     * representing the type of shape to create. It then uses the ShapeFactory
     * to create the shape and prints details about it.
     *
     * @param args command-line arguments; expects one argument of type RegularShapeType.
     */
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }

        try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = ShapeFactory.create(type);
            System.out.println(
                    String.format(
                            "Successfully created a %s with %d sides.",
                            type,
                            shape.getNumberOfEdges()
                    )
            );
        } catch (IllegalArgumentException ex) {
            System.err.println(
                    "Parameter '" + args[0] + "' is not a valid RegularShapeType"
            );
            return;
        }
    }
}
