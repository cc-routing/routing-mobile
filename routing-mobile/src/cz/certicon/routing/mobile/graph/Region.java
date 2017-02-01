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
public class Region {

    short turnTableCount;
    private TurnTable[] turnTables;

    private ZeroLayer zeroLayer;

    byte overLayerCount;
    private OverLayer[] overLayers;
}
