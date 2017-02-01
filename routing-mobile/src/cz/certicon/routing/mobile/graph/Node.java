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
public class Node {

    // in+out edges in the same cell
    byte inEdgesCount;
    private int[] inEdges;

    byte outEdgesCount;
    private int[] outEdges;

    // turn table index in my region
    private int turnTable;

}
