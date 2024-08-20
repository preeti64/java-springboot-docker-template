package com.resttemplate.microservicestartertemplate.repository;

import com.resttemplate.microservicestartertemplate.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends JpaRepository<BaseEntity, Long> {
    // Add custom query methods if needed
}

