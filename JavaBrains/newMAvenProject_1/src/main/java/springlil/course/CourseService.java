package springlil.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

// This is a singleton

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getCourses() {
        List<Course> listCourses = new ArrayList<>();
        courseRepository.findAll().forEach(listCourses::add);

       return listCourses;
    }

    public Course getCourseId(String id) {
//       return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();

        return courseRepository.findById(id).get();
    }

    public void addCourse(Course topic) {
        courseRepository.save(topic); // SAving data.

    }

    public void updateCourse(String id, Course topic) {
        courseRepository.save(topic); // SAving and updatedata.

    }
//
    public void deleteCourse(String id) {
//        listOfTopics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
