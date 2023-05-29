// Parcel.java

package com.entity;

import java.util.Map;

/**
 * Parcel
 */
@lombok.Data
public class Parcel {
    private String boxType;
    private String description;
    private Dimension dimension;
    private Item[] items;
    private Weight weight;
}
// Weight.java

