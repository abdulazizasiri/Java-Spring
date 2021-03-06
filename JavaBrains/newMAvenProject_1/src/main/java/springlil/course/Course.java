package springlil.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id // This is te primary key.
    private String id;

    private String name;

    private String description ;


    public springlil.topics.Course getTopic() {
        return topic;
    }

    public void setTopic(springlil.topics.Course topic) {
        this.topic = topic;
    }

    @ManyToOne
    private springlil.topics.Course topic;

    public Course(){

    }
    public Course(String id, String name, String desc, String topicId) {
        this.id = id; //
        this.name = name; //
        this.description = desc; //
        this.topic = new springlil.topics.Course(topicId, "", ""); // This is not clear.
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
}
