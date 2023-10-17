package com.udacity.pricing.domain.price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "prices", path = "prices")
public interface PriceRepository extends JpaRepository<Price, Long> {
    Price findByVehicleId(Long vehicleId);
}
