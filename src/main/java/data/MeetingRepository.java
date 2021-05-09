package data;

import models.Meeting;
import models.Person;

import java.time.LocalDate;
import java.util.List;

public class MeetingRepository {

    private List<Meeting> meetings;



    public List<Meeting> findAll(){

    }

    public List<Meeting> findByAttendeePersonId(int id){

    }

    public Meeting finById(int id){

    }

    public List<Meeting> findByMeetingDate(LocalDate meetingdate){

    }

    public List<Meeting> findByMeetingsBetween(LocalDate firstDate, LocalDate lastDate){

    }

    public List<Meeting> findByOrganizerPersonId(int personId){

    }

    public List<Meeting> findByTopic(String topic){

    }

    public int getMeetingCount(){

    }

    public  Meeting persist(Meeting meeting){

    }

    public boolean remove(int meetingId){

    }


}
