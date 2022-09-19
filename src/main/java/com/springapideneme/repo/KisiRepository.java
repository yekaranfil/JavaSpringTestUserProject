package com.springapideneme.repo;

import com.springapideneme.entity.Kisi;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends JpaRepository<Kisi, Long> {


   // Kisi findByUserName(String userName);
}
