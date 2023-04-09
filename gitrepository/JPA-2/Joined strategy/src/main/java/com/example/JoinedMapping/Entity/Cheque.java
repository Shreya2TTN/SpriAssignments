package com.example.JoinedMapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cheque extends Mobile{
    private String ChequeNumber;

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        ChequeNumber = chequeNumber;
    }

}
