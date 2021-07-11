package com.asiri.courses.ccoursesAPIv2.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List <Topic>topicsList =new ArrayList<Topic> (Arrays.asList(
            new Topic("Java", "Java is awesome", "Java is great for building web apps"),
            new Topic("swift", "Swift is new and beatiful", "Swift is great for building IOS native apps"),
            new Topic("JavaScript", "javascript has evolved tremendously", "javaScript was created in 10 days"),
            new Topic("ruby", "ruby is not pretty much popular", "Ruby is used in the sys adminstrations")
    ));


    public List<Topic> getAllTopics() {
        return topicsList;
    }
    public Topic getTopic(String id){
        return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicsList.add(topic);

    }

    public void updateTopic(String id, Topic updatedTopic) {
        for (int i =0; i<topicsList.size(); i++) {
            Topic tempTopic = topicsList.get(i);
            if (tempTopic.getId().equals(id)) {
                // We  found it.
                topicsList.set(i, updatedTopic);
                return ; // done
            }
        }
    }

    public void deleteTopic(String id) {
        topicsList.removeIf(topic -> topic.getId().equals(id)); // REmoveIf is magical
    }
}
