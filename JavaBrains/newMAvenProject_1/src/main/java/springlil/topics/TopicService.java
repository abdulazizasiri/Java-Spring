package springlil.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
// This is a singleton
@Service // This is a sterotype in spring.
public class TopicService {
    @Autowired
    private springlil.topics.CourseRepository topicRepository;


    public List<springlil.topics.Course> getTopics() {
        List<springlil.topics.Course> listtopics = new ArrayList<>();
       topicRepository.findAll().forEach(listtopics::add);

       return listtopics;
    }

    public springlil.topics.Course getTopicId(String id) {
//       return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();

        return topicRepository.findById(id).get();
    }

    public void addTopic(springlil.topics.Course topic) {
        topicRepository.save(topic); // SAving data.

    }

    public void updateTopic(String id, springlil.topics.Course topic) {
        topicRepository.save(topic); // SAving and updatedata.

    }
//
    public void deleteTopic(String id) {
//        listOfTopics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
