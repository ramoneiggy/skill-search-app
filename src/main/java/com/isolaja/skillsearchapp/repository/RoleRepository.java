package com.isolaja.skillsearchapp.repository;

import com.isolaja.skillsearchapp.model.ERole;
import com.isolaja.skillsearchapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
