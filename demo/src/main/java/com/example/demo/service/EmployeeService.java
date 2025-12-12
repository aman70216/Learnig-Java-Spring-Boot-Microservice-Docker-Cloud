package com.example.demo.service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee Not found"));
    }

    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    public Employee update(Long id, Employee emp) {
        Employee existing = getById(id);

        existing.setName(emp.getName());
        existing.setEmail(emp.getEmail());
        existing.setSalary(emp.getSalary());
        existing.setDepartment(emp.getDepartment());  // FIXED LINE

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Employee> getByDepartment(Long deptId) {
        return repo.findByDepartmentId(deptId);
    }
}
