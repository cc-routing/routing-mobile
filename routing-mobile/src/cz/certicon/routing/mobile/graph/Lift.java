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
public class Lift {

    // cell index in my region
    private int cell;

    // 1. entry/exit point index when used from Edge to Overlay
    // 2. edge index when used in OverlayCell Matrix
    private int index;
}
