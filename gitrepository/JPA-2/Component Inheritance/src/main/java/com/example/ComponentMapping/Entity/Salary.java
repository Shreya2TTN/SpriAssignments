package com.example.ComponentMapping.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    private float basicSalary;
    private float bonusSalary;
    private float taxAmount;
    private float specialAllowanceSalary;

    public Salary(float basicSalary, float bonusSalary, float taxAmount, float specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public Salary() {
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(float bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public float getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(float specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "basicSalary=" + basicSalary +
                ", bonusSalary=" + bonusSalary +
                ", taxAmount=" + taxAmount +
                ", specialAllowanceSalary=" + specialAllowanceSalary +
                '}';
    }
}
