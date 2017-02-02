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

// "half" one way edge
public class Edge {
    // target node
    Link node;

    // "expanded" turn indexes
    byte turnInIdx;
    byte turnOutIdx;

    //if > 0 then this is border edge
    byte liftCount;
    LiftUp[] lift;
}
