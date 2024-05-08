package org.example.dockerdemo.service;

import org.example.dockerdemo.entity.DemoEntity;
import org.example.dockerdemo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository repository;


    @Override
    public List<DemoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public DemoEntity save(DemoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<DemoEntity> findById(int id) {
        if (repository.findById(id).isPresent())
            return repository.findById(id);
        return Optional.empty();
    }
}
