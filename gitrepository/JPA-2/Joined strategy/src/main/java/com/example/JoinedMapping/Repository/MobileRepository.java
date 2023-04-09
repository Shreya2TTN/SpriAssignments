package com.example.JoinedMapping.Repository;

import com.example.JoinedMapping.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {
}
