package com.programming.springdata.repositories;

import com.programming.springdata.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
