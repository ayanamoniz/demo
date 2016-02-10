package com.demo.ayana.demo;

/**
 * Created by Ayana on 2/9/2016.
 */

public class PatientDocReference {
    int UUID;
    String Issuer;
    String ID;

    PatientDocReference(String issuer, String id, int reference) {
        Issuer = issuer;
        ID = id;
        UUID = reference;
    }
}
