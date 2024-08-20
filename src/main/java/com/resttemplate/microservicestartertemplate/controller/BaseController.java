package com.resttemplate.microservicestartertemplate.controller;

import com.resttemplate.microservicestartertemplate.dto.BaseDto;
import com.resttemplate.microservicestartertemplate.responses.ApiResponse;
import com.resttemplate.microservicestartertemplate.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/your-entities")
public class BaseController {

    private final BaseService service;

    @PostMapping
    public ResponseEntity<ApiResponse<BaseDto>> create(@RequestBody BaseDto dto) {
        BaseDto createdEntity = service.save(dto);
        return ResponseEntity.ok(new ApiResponse<>(true, "Entity created successfully", createdEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<BaseDto>> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(dto -> ResponseEntity.ok(new ApiResponse<>(true, "Entity found", dto)))
                .orElseGet(() -> ResponseEntity.status(404)
                        .body(new ApiResponse<>(false, "Entity not found", null)));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<BaseDto>>> getAll() {
        List<BaseDto> entities = service.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Entities retrieved successfully", entities));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

