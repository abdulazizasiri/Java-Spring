package springlil.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// This is a singleton

@Service
public class LessonService {
    @Autowired
    private LessonsRepository courseRepository;
    public List<Lesson> getCourses(String id) {
        List<Lesson> listCourses = new ArrayList<>();

        courseRepository.findByTopicId(id).forEach(listCourses::add);

       return listCourses;
    }

    public Lesson getCourseId(String id) {
//       return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();

        return courseRepository.findById(id).get();
    }

    public void addCourse(Lesson topic) {
        courseRepository.save(topic); // SAving data.

    }

    public void updateCourse(String id, Lesson topic) {
        courseRepository.save(topic); // SAving and updatedata.

    }
//
    public void deleteCourse(String id) {
//        listOfTopics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
