package com.imran.learnspringboot.learn_jpa_and_hibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;
public interface SpringDataJpaRepositary extends JpaRepository<Course,Long>{
    
}
