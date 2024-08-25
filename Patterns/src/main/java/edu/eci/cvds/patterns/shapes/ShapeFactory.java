package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

/**
 * The ShapeFactory class provides a method to create instances of different shapes.
 * It uses the Factory design pattern to instantiate shapes based on the provided type.
 */
public class ShapeFactory {

    /**
     * Creates a Shape object based on the specified RegularShapeType.
     *
     * @param shape the type of shape to create, represented by a RegularShapeType enum.
     * @return a Shape object corresponding to the specified type, or null if the type is not recognized.
     */
    public static Shape create(RegularShapeType shape) {
        switch (shape) {
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                return null;
        }
    }
}
