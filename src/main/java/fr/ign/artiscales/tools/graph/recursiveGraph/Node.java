package fr.ign.artiscales.tools.graph.recursiveGraph;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;

public class Node extends GraphElement<Point,Node> {
  private Coordinate coordinate;
  public Coordinate getCoordinate() {
    return coordinate;
  }
  public Node(Coordinate c) {
    this.coordinate = c;
  }
  @Override
  public Point getGeometry() {
    return new GeometryFactory().createPoint(this.coordinate);
  }
}
