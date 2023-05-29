// Shipment.java

package com.entity;

import java.util.Map;

/**
 * ApifoxModel
 */
@lombok.Data
public class Shipment {
    private String deliveryInstructions;
    private Parcel[] parcels;
    private Address returnTo;
    private Address shipFrom;
    private Address shipTo;
    private String type;
}
