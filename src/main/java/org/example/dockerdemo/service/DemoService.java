package org.example.dockerdemo.service;

import org.example.dockerdemo.entity.DemoEntity;

import java.util.List;
import java.util.Optional;

public interface DemoService {
    List<DemoEntity> findAll();

    DemoEntity save(DemoEntity entity);

    Optional<DemoEntity> findById(int id);
}
