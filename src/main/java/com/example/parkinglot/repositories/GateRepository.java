package com.example.parkinglot.repositories;



import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, com.example.parkinglot.Models.Gate> Gates = new HashMap<>();

    public Optional<    com.example.parkinglot.Models.Gate> findById(Long gateId) {
        if (Gates.containsKey(gateId)) {
            return Optional.of(Gates.get(gateId));
        }
        return Optional.empty();
    }
}
