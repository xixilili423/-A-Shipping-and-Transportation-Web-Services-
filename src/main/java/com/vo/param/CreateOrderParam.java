package com.vo.param;

@lombok.Data
public class CreateOrderParam {
    private String deliveryInstructions;
    private String parcels;
    private String returnTo;
    private String shipFrom;
    private String shipTo;
    private String type;
}