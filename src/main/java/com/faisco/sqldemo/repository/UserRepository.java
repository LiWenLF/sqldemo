package com.faisco.sqldemo.repository;


import com.faisco.sqldemo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select t from User t where t.userName =?1 and t.passWord =?2")
    List<User> findByUserAndPwd(String userName, String passWord);
}
