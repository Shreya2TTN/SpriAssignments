package com.example.TablePerClass.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Cheque")
public class Cheque extends Mobile{
    private String ChequeNumber;

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        ChequeNumber = chequeNumber;
    }

}
