package com.shunya.Service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shunya.Service.CourseService;
import com.shunya.tdl.Entity.Course;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	private CourseService cService;
	
	public CourseServiceImpl(CourseService cService) {
		super();
		this.cService = cService;
	}

	@Override
	public List<Course> getAllCourses() {
		return cService.getAllCourses();
	}

	@Override
	public Course saveCourse(Course course) {
		return cService.saveCourse(course);
	}

	
	@Override
	public Course getCourseByID(Long id) {
		return cService.getCourseByID(id);
	}

	@Override
	public Course updateCourse(Course course) {
		return cService.saveCourse(course);
	}

	@Override
	public void deleteCourseById(Course id) {
		cService.deleteCourseById(id);
		
	}

}
