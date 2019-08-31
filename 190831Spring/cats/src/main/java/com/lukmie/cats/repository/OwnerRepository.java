package com.lukmie.cats.repository;

import com.lukmie.cats.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
