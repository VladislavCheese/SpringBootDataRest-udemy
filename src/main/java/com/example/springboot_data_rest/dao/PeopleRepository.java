package com.example.springboot_data_rest.dao;

import com.example.springboot_data_rest.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {
}
