package com.shunya.tdl.Repositories;	

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shunya.tdl.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
