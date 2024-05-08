package org.example.dockerdemo.repository;

import org.example.dockerdemo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity,Integer> {
}
