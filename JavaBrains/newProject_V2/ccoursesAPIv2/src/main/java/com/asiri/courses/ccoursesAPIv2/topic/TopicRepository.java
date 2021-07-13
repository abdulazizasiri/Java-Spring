package com.asiri.courses.ccoursesAPIv2.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

    // getAllTopics()
    // getTopic(id)
    // updateTopic(Topic t)
    // deleteTopic(id)


}
