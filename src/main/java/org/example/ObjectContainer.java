package org.example;

import java.util.HashMap;
import java.util.Map;

public class ObjectContainer {
    // This class will store all the objects that we will create in our application.
    // <p>
    // This class will have two methods:
    // <p>
    // register(String key, Object object) : This method will add the object to the map.
    // get(String key) : This method will return the object from the map.

    Map<String, Object> objectMap;

    public ObjectContainer() {
        this.objectMap = new HashMap<>();
    }

    public void register(String key, Object object) {
        objectMap.put(key, object);
    }

    public Object get(String key) {
        return objectMap.get(key);
    }

}
