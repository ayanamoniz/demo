package com.demo.ayana.demo;

/**
 * Created by Ayana on 2/9/2016.
 */

public class PatientDocReference {
    String UUID;
    String Issuer;
    String ID;

    PatientDocReference(String issuer, String id, String reference) {
        Issuer = issuer;
        ID = id;
        UUID = reference;
    }
}
