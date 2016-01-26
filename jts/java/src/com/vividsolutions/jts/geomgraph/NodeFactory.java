
/*
 * The JTS Topology Suite is a collection of Java classes that
 * implement the fundamental operations required to validate a given
 * geo-spatial data set to a known topological specification.
 * 
 * Copyright (C) 2016 Vivid Solutions
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * (http://www.eclipse.org/legal/epl-v10.html), and the Vivid Solutions BSD
 * License v1.0 (found at the root of the repository).
 * 
 */
package com.vividsolutions.jts.geomgraph;

import com.vividsolutions.jts.geom.Coordinate;


/**
 * @version 1.7
 */
public class NodeFactory {
/**
 * The basic node constructor does not allow for incident edges
 */
  public Node createNode(Coordinate coord)
  {
    return new Node(coord, null);
  }
}
