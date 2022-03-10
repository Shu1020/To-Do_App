package com.shunya.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shunya.tdl.Entity.Course;

@Service
public interface CourseService {
	
	List<Course> getAllCourses();
	
	Course saveCourse(Course course);
	
	Course getCourseByID(Long id);
	
	Course updateCourse(Course course);
	
	void deleteCourseById(Course id);
	
	
//	@Autowired
//	private CourseRepository cRepo;
//	
//	//POST
//	public Course saveCourse(Course course) {
//		System.out.println(course.toString());
//		return cRepo.save(course);
//	}
//	
//	public List<Course> saveCourses(List<Course> courses){
//		return cRepo.saveAll(courses);
//	}
//	//GET
//	public List<Course> getCourses(){
//		return cRepo.findAll();
//	}
//	public Course getCourseById(int id){
//		return cRepo.findById(id).orElse(null);
//	}
//	public Course getCourseByName(String name) {
//		return cRepo.findByName(name);
//	}
//	public List<Course> getCourseForUser(String username){
//		return cRepo.findAllByUsername(username);
//	}
//	//PUT
//	public Course updateCourse(Course course) {
//		System.out.println("updates");
//		Course existing_course = cRepo.findById(course.getId()).orElse(null);
//		existing_course.setName(course.getName());
//		existing_course.setDescription(course.getDescription());
//		existing_course.setStatus(course.getStatus());
//		return cRepo.save(existing_course);
//	}
//	
//	//Delete
//	public String deleteCourse(int id) {
//		cRepo.deleteById(id);
//		return id + " id -> couese removed/completed";
//	}
	
}
