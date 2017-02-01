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
public class BaseCell {

    // zeroLayer: size = edges count
    // overLayer: size = cell matrix rows x columns
    Distance[] distances;

    // position of metric for the cell in the metric binary file for my region
    int position;
}
