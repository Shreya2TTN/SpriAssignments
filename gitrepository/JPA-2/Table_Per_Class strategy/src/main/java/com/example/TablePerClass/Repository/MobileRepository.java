package com.example.TablePerClass.Repository;

import com.example.TablePerClass.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {

}
