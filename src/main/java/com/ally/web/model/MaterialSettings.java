package com.ally.web.model;

/**
 * Created by ally on 7/24/17.
 */
public class MaterialSettings {
    private int materialId;
    private double warn;
    private double fill;

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

    public double getFill() {
        return fill;
    }

    public void setFill(double fill) {
        this.fill = fill;
    }
}
