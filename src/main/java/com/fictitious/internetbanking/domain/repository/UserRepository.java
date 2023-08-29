package com.fictitious.internetbanking.domain.repository;

import com.fictitious.internetbanking.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
