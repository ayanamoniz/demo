package com.demo.ayana.demo;

/**
 * Created by Ayana on 2/9/2016.
 */
public class PatientRegistration {
    String Issuer;
    String ID;
    String FirstName;
    String LastName;
    String DateOfBirth;

    PatientRegistration() {
    }

    //1. Registration of a patient using any (ISSUERX, IDX) where X is an arbitrary issuer
    PatientRegistration(String ISSUERX, String IDX){
        Issuer = ISSUERX;
        ID = IDX;
        //Use PDRS to lookup the IDX for ISSUERX and select the reference UUID
        //Look up the patient's IDB for ISSUERB based on the reference UUID
        //Use PDS to lookup the patient's demographic information based on the IDB for ISSUERB
        //Autofill and verify the patient's demographic information
        FirstName = "First Name from PDS";
        LastName = "Last Name from PDS";
        DateOfBirth = "DOB from PDS";
    }

    /*2. Registration of a patient using partial demographic information (e.g. Last Name, Date of Birth)
    Use PDS to lookup the rest of the patient's demographic information and register them using those details as well as their
    document from ISSUERB*/

    /*3. Registration of a patient whose demographic information is not in the PDS
    Register them manually, and if they have their IDB for ISSUERB create a new Patient Demographic for them*/




}

