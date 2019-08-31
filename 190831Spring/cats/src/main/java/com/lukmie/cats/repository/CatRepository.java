package com.lukmie.cats.repository;

import com.lukmie.cats.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {
    List<Cat> findAllByName(String name);

    List<Cat> findAllByNameAndTailLengthBetween(String name, Integer min, Integer max);

    default List<Cat> findCats(String name, Integer min, Integer max) {
        return findAllByNameAndTailLengthBetween(name, min, max);
    }
}
