package springlil.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service // This is a sterotype in spring.
public class TopicService {

    private List<Topic> listOfTopics = Arrays.asList(
            new Topic("Java", "Java Spring", "It is OOP"),
                new Topic("JavaScript", "NodeJS", "It is the language of the web"),
                new Topic("Swift", "Amazing and simple", "IOS Language")
        );

    public List<Topic> getTopics() {
        return listOfTopics;
    }


}
