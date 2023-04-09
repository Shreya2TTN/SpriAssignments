package com.example.TablePerClass.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Credit_Card")
public class CreditCard extends Mobile{
    private String ccNumber;

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }


}
