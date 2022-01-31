package com.example.fullproject.Repository;

import com.example.fullproject.model.Bar;
import com.example.fullproject.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar,Integer> {
}
