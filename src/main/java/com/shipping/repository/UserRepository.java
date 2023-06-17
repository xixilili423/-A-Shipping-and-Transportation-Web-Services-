package com.shipping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import com.shipping.entity.*;
//@Component
@Controller
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsernameAndPassword(String username, String password);
}
