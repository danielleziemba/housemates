package com.github.danielleziemba.housemates.repository;

import com.github.danielleziemba.housemates.models.ERole;
import com.github.danielleziemba.housemates.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
