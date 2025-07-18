package com.projetoCurse.victorCurse.repositories;

import com.projetoCurse.victorCurse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
