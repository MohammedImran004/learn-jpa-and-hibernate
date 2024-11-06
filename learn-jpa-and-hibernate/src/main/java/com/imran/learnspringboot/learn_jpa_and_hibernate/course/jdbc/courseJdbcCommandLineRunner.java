package com.imran.learnspringboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.imran.learnspringboot.learn_jpa_and_hibernate.course.Course;
import com.imran.learnspringboot.learn_jpa_and_hibernate.course.SpringDataJpaRepositary;
@Component
public class courseJdbcCommandLineRunner implements CommandLineRunner{
    // @Autowired
    // private courseJdbcRepositary repositary;
    @Autowired
        private SpringDataJpaRepositary repositary;
    @Override
    public void run(String... args) throws Exception {
       repositary.save(new Course(1,"learn Aws","in28minutes"));
       repositary.save(new Course(2,"learn Azure","imran"));
       repositary.deleteById(1l);
       System.out.println(repositary.findById(2l));
    }
    
}
