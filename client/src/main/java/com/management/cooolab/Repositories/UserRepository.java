package com.management.cooolab.Repositories;

import com.management.cooolab.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByDepartementId(int departmentId);
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);

}
