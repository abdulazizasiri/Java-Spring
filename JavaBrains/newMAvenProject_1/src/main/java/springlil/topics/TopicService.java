package springlil.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
// This is a singleton

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getTopics() {
        List<springlil.topics.Topic> listtopics = new ArrayList<>();
       topicRepository.findAll().forEach(listtopics::add);

       return listtopics;
    }

    public Topic getTopicId(String id) {
//       return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();

        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic); // SAving data.

    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic); // SAving and updatedata.
    }
//
    public void deleteTopic(String id) {
//        listOfTopics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
