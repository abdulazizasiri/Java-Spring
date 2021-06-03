package springlil.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id // This is te primary key.
    private String id;

    private String name;

    private String description ;

    public Topic(){

    }
    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.description = desc;
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
