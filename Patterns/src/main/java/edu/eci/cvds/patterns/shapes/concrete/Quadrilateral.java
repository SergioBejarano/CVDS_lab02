package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * The Quadrilateral class implements the Shape interface and represents a quadrilateral shape.
 * A quadrilateral is a polygon with four edges and four vertices.
 */
public class Quadrilateral implements Shape {

    /**
     * Returns the number of edges of the quadrilateral.
     *
     * @return the number of edges, which is always 4 for a quadrilateral.
     */
    @Override
    public int getNumberOfEdges() {
        return 4;
    }

}
