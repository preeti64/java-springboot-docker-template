package com.resttemplate.microservicestartertemplate.service;

import com.resttemplate.microservicestartertemplate.dto.BaseDto;
import com.resttemplate.microservicestartertemplate.entity.BaseEntity;
import com.resttemplate.microservicestartertemplate.repository.BaseRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BaseService {

    private final BaseRepository repository;
    private final ModelMapper modelMapper;

    public BaseDto save(BaseDto dto) {
        BaseEntity entity = modelMapper.map(dto, BaseEntity.class);
        entity = repository.save(entity);
        return modelMapper.map(entity, BaseDto.class);
    }

    public Optional<BaseDto> findById(Long id) {
        return repository.findById(id)
                .map(entity -> modelMapper.map(entity, BaseDto.class));
    }

    public List<BaseDto> findAll() {
        return repository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, BaseDto.class))
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

