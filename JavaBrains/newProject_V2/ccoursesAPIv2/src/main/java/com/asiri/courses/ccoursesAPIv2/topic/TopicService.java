package com.asiri.courses.ccoursesAPIv2.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepos;
//    private List <Topic>topicsList =new ArrayList<Topic> (Arrays.asList(
//            new Topic("Java", "Java is awesome", "Java is great for building web apps"),
//            new Topic("swift", "Swift is new and beatiful", "Swift is great for building IOS native apps"),
//            new Topic("JavaScript", "javascript has evolved tremendously", "javaScript was created in 10 days"),
//            new Topic("ruby", "ruby is not pretty much popular", "Ruby is used in the sys adminstrations")
//    ));


    public List<Topic> getAllTopics() {
        List <Topic> topics = new ArrayList<>();
        topicRepos.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id){
//        return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepos.findById(id).get();
    }

    public void addTopic(Topic topic) {
        System.out.println("Topucs "+topic.getId());
        topicRepos.save(topic);
    }

    public void updateTopic(String id, Topic updatedTopic) {
//        for (int i =0; i<topicsList.size(); i++) {
//            Topic tempTopic = topicsList.get(i);
//            if (tempTopic.getId().equals(id)) {
//                // We  found it.
//                topicsList.set(i, updatedTopic);
//                return ; // done
//            }
//        }
        topicRepos.save(updatedTopic);

    }

    public void deleteTopic(String id) {

        topicRepos.deleteById(id);
    }
}
