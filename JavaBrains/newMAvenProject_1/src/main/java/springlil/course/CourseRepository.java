package springlil.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId) ;  // This is used to create a OneToMany



}
