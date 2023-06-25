package com.gamingroom;


/**
 * I believe this is called a superclass. Other classes will inherit from this one.
 */
public class Entity {
    protected long id;
    protected String name;


    /**
     * Constructor
     * PRIVATE
     */
    protected Entity() {

    }

    /**
     * public Constructor - overloaded
     * @param id
     * @param name
     */
    Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * gets the current ID
     * @return the current ID
     */
    //Methods
    public long getId() {
        return id;
    }

    /**
     * gets the current name
     * @return the current name
     */
    public String getName() {
        return name;
    }

    public String toString() {
        return null;
    }


}
