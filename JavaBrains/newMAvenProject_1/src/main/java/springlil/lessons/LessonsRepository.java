package springlil.lessons;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonsRepository extends CrudRepository<Lesson, String> {
    public List<Lesson> findByTopicId(String topicId) ;  // This is used to create a OneToMany



}
