package com.example.JPAMapping.Repository;

import com.example.JPAMapping.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {

}
