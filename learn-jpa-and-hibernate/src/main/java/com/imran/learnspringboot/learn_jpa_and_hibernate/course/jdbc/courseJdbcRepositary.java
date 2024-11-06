package com.imran.learnspringboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.imran.learnspringboot.learn_jpa_and_hibernate.course.Course;
@Repository
public class courseJdbcRepositary {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String Insert_Query="""
            insert into course (id,name,author) values(?,?,?);
            """;
    private static String Delete_Query="""
            delete from course where id=?;
            """;
    public void insert(Course course){
        springJdbcTemplate.update(Insert_Query,course.getId(),course.getName(),course.getAuthor());
    }
    public void delete(long id){
        springJdbcTemplate.update(Delete_Query,id);
    }
}
