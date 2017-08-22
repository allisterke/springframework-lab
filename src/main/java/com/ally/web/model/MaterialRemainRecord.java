package com.ally.web.model;

/**
 * Created by ally on 7/24/17.
 */
public class MaterialRemainRecord {
    private int storeId;
    private int materialId;
    private double amount;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
