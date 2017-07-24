package com.ally.web.model;

/**
 * Created by ally on 7/24/17.
 */
public class MaterialSettings {
    private int storeId;
    private int materialId;
    private double warn;
    private double must;
    private double fill;

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

    public double getWarn() {
        return warn;
    }

    public void setWarn(double warn) {
        this.warn = warn;
    }

    public double getMust() {
        return must;
    }

    public void setMust(double must) {
        this.must = must;
    }

    public double getFill() {
        return fill;
    }

    public void setFill(double fill) {
        this.fill = fill;
    }
}
