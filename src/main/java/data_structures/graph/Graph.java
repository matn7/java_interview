package data_structures.graph;

import java.util.List;

/**
 * Created by Mati on 01.08.2017.
 */
public interface Graph {

    enum GraphType {
        DIRECTED,
        UNDIRECTED
    }

    // An edge lies between two vertices
    // vertices are represented by numbers
    void addEdge(int v1, int v2);

    List<Integer> getAdjacentVertices(int v);

}
