package springlil.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Course, String> {
}
