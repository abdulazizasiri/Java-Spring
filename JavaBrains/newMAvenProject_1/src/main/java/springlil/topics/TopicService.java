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

    public void updateTopic(String id, Topic topic) {
        // Long form
        for (int i = 0 ; i < listOfTopics.size(); i++) {
            Topic t = listOfTopics.get(i);
            if (t.getId().equals(id)){
                listOfTopics.set(i, topic);
                return ;
            }
        }
    }

    public void deleteTopic(String id) {
        listOfTopics.removeIf(t -> t.getId().equals(id));
    }
}