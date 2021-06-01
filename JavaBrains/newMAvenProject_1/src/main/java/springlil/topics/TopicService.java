package springlil.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// This is a singleton
@Service // This is a sterotype in spring.
public class TopicService {

    private List<Topic> listOfTopics = new ArrayList<>(Arrays.asList(
            new Topic("Java", "Java Spring", "It is OOP"),
                new Topic("JavaScript", "NodeJS", "It is the language of the web"),
                new Topic("Swift", "Amazing and simple", "IOS Language")
    ));

    public List<Topic> getTopics() {
        return listOfTopics;
    }

    public  Topic getTopicId(String id) {
        return listOfTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        this.listOfTopics.add(topic);
    }
}
