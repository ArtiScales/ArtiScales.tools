package fr.ign.artiscales.tools.graph.recursiveGraph;

import java.util.ArrayList;
import java.util.List;

import org.locationtech.jts.geom.Polygon;

public class Face extends GraphElement<Polygon,Face> {
  List<HalfEdge> edges = new ArrayList<>();
  Polygon polygon = null;
  public Face(Polygon p) {
    this.polygon = p;
  }
  public Face() {
  }
  public List<HalfEdge> getEdges() {
    return edges;
  }
  public void setEdges(List<HalfEdge> edges) {
    this.edges = edges;
  }
  public Polygon getGeometry() {
    return polygon;
  }
  public void setPolygon(Polygon polygon) {
    this.polygon = polygon;
  }
}
