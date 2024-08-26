package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * The Hexagon class implements the Shape interface and represents a hexagon shape.
 * A hexagon is a polygon with six edges and six vertices.
 */
public class Hexagon implements Shape {

    /**
     * Returns the number of edges of the hexagon.
     *
     * @return the number of edges, which is always 6 for a hexagon.
     */
    @Override
    public int getNumberOfEdges() {
        return 6;
    }
}
