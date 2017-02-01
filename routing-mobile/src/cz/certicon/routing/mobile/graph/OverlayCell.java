/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.certicon.routing.mobile.graph;

/**
 *
 * @author Blahoslav Potoček <potocek@merica.cz>
 */
public class OverlayCell {

    // Lifts point to the edges in zero layer in my region

    int entryEdgeCount;
    private Lift[] entryEdges;

    int exitEdgeCount;
    private Lift[] exitEdges;
}
