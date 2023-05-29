package com.entity;

@lombok.Data
public class Billing {
    private String accountNumber;
    private String country;
    private String postalCode;
    private String type;
    private String paidBy; /* shipper */
}
