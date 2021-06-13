package springlil.lessons;

import springlil.topics.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lesson {
    @Id // This is te primary key.
    private String id;

    private String name;

    private String description ;


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne
    private Course course;

    public Lesson(){

    }
    public Lesson(String id, String name, String desc, String courseId) {
        this.id = id; //
        this.name = name; //
        this.description = desc; //
        this.course = new Course(courseId, "", ""); // This is not clear.
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
