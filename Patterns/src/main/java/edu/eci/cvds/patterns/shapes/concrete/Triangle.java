package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * The Triangle class implements the Shape interface and represents a triangle shape.
 * A triangle is a polygon with three edges and three vertices.
 */
public class Triangle implements Shape {

    /**
     * Returns the number of edges of the triangle.
     *
     * @return the number of edges, which is always 3 for a triangle.
     */
    @Override
    public int getNumberOfEdges() {
        return 3;
    }

}