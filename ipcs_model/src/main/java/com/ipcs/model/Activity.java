package com.ipcs.model;

import com.ipcs.model.Base.BasicObject;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chen Chao
 */
public class Activity extends BasicObject {

    private String name;

    private String location;

    private String description;

    private Date startTime;

    private Person host;

    private Set<Person> persons = new HashSet<Person>();

    public Activity() {
    }

    public Activity(ActivityBuilder activityBuilder){
        this.name = activityBuilder.name;
        this.location = activityBuilder.location;
        this.description = activityBuilder.description;
        this.startTime = activityBuilder.startTime;
        this.host = activityBuilder.host;
    }


    public static class ActivityBuilder{
        private String name;
        private String location;
        private String description;
        private Date startTime;
        private Person host;

        public ActivityBuilder withName(String name){
            this.name = name;
            return this;
        }

        public ActivityBuilder withLocation(String location){
            this.location = location;
            return this;
        }

        public ActivityBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public ActivityBuilder withStartDate(Date startTime){
            this.startTime= startTime;
            return this;
        }
        public ActivityBuilder withHost (Person host){
            this.host = host;
            return this;
        }

        public Activity builder(){
            return new Activity(this);
        }

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getHost() {
        return host;
    }

    public void setHost(Person host) {
        this.host = host;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person){
        this.persons.add(person);
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public int hashCode() {
        int factor = 31;
        int result = 17 * factor + name.hashCode();
        result = 17 * result + location.hashCode();
        result = 17 * result + startTime.hashCode();
        return result;
    }

    public boolean equals(Object obj) {
        if (null == obj)
            return false;
        if (this == obj)
            return true;
        if (obj.getClass() != Permission.class)
            return false;
        Activity activity = (Activity) obj;
        return this.name.equals(activity.getName()) && this.location.equals(activity.getLocation()) && this.startTime.equals((activity.getStartTime()));

    }

    public String toString() {
        return "Activity start time is " + startTime + "and  name is " + name + " and location is " + location + super.toString();
    }
}