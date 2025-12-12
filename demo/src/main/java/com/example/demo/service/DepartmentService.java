package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public Department getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public Department create(Department dept) {
        return repo.save(dept);
    }
}

