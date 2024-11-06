package com.imran.learnspringboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.imran.learnspringboot.learn_jpa_and_hibernate.course.Course;
@Component
public class courseJdbcCommandLineRunner implements CommandLineRunner{
    @Autowired
    private courseJdbcRepositary repositary;
    @Override
    public void run(String... args) throws Exception {
       repositary.insert(new Course(1,"learn Aws","in28minutes"));
       repositary.insert(new Course(2,"learn Azure","imran"));
       repositary.delete(1);
    }
    
}
