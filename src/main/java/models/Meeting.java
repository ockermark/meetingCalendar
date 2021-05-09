package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Meeting {

    private int id;
    private String topic;
    private LocalDate meetingDate;
    private LocalTime start;
    private LocalTime end;
    private Person organizer;
    private List<Person> attendants;



    public int compareTo(Meeting meeting){

    }

    public void removeAttendant(String Person){

    }

    public void addAttendant(String Person){

    }

    public List<Person> getAttendants() {
        return attendants;
    }

    public LocalTime getEnd() {
        return end;
    }

    public int getId() {
        return id;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public LocalTime getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }

    public void setAttendants(List<Person> attendants) {
        this.attendants = attendants;
    }

}
