package com.example.JPAMapping.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Mobile{
    private String ChequeNumber;

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        ChequeNumber = chequeNumber;
    }

}
