package src.model;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private int id;
    private String name;
    List<Value> values;

    public Property(String name) {
        this.name = name;
        this.values=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}
