package com.service;

import com.dto.QuantityDTO;
import com.entity.QuantityMeasurementEntity;
import com.measurement.Quantity;
import com.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementServiceImpl
        implements IQuantityMeasurementService {

    private final IQuantityMeasurementRepository repository;

    public QuantityMeasurementServiceImpl(
            IQuantityMeasurementRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {

        Quantity<?> a = new Quantity<>(q1.getValue(), null);
        Quantity<?> b = new Quantity<>(q2.getValue(), null);

        boolean result = a.equals(b);

        repository.save(
                new QuantityMeasurementEntity(
                        "COMPARE",
                        q1.toString(),
                        String.valueOf(result),
                        false
                )
        );

        return result;
    }

    @Override
    public QuantityDTO convert(QuantityDTO quantity, String targetUnit) {
        return quantity;
    }

    @Override
    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2) {
        return q1;
    }

    @Override
    public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2) {
        return q1;
    }

    @Override
    public double divide(QuantityDTO q1, QuantityDTO q2) {
        return 0;
    }
}