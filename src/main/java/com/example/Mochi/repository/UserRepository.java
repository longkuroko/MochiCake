package com.example.Mochi.repository;

import com.example.Mochi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    /**
     * Delete user by username
     * @param username
     * @return
     */
    User deleteByUsername(String username);

}
