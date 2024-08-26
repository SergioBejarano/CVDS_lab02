package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * The Pentagon class implements the Shape interface and represents a pentagon shape.
 * A pentagon is a polygon with five edges and five vertices.
 */
public class Pentagon implements Shape {

    /**
     * Returns the number of edges of the pentagon.
     *
     * @return the number of edges, which is always 5 for a pentagon.
     */
    @Override
    public int getNumberOfEdges() {
        return 5;
    }
}
