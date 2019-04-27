package com.rishad.location.web.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishad.location.web.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
