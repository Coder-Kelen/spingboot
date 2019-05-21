package com.cgx.demo.dao;

import com.cgx.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName:UserRepository
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/18 16:27
 * @Version:1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> getUserByUserName(String userName);
}
