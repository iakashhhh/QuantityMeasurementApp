package com.app.measurementservice.model;

import com.app.measurementservice.unit.IMeasurable;

/*
 * =========================================================
 * QuantityModel
 * =========================================================
 *
 * UC15 – Model Layer
 *
 * Purpose:
 * Internal representation of a quantity used inside
 * the Service layer.
 *
 * This separates internal processing from external DTOs.
 *
 * Model -> used for computations
 * DTO   -> used for communication
 */

public class QuantityModel<U extends IMeasurable> {

    private double value;
    private U unit;

    public QuantityModel(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }
}