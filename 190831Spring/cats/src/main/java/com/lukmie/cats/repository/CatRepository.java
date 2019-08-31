package com.lukmie.cats.repository;

import com.lukmie.cats.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {

}
