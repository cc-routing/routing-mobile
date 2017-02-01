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
// node link
public class Link {

    // country / district
    private short region;

    // cell index in the region
    private int cell;

    // node index in the cell
    private int index;
}
