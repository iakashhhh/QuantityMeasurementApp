package com.app;

import com.controller.QuantityMeasurementController;
import com.repository.QuantityMeasurementCacheRepository;
import com.service.IQuantityMeasurementService;
import com.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityMeasurementCacheRepository repository =
                QuantityMeasurementCacheRepository.getInstance();

        IQuantityMeasurementService service =
                new QuantityMeasurementServiceImpl(repository);

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        System.out.println("Quantity Measurement Application UC15 Started");
    }
}