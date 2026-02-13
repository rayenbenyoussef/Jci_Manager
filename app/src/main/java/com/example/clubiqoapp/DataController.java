package com.example.clubiqoapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataController {
    public static ArrayList<Event> getEvents(){
        ArrayList<Event> events=new ArrayList<>();
        events.add(new Event(
                "1",
                20.0f,
                50,
                "https://maps.google.com/?q=Central+Park",
                "Central Park",
                LocalDate.of(2025, 3, 15),
                "Join us for a fun outdoor gathering with music and food.",
                "Spring Festival",
                R.drawable.event1,
                R.drawable.event1
        ));

        events.add(new Event(
                "2",
                0.0f,
                30,
                "https://maps.google.com/?q=City+Library",
                "City Library",
                LocalDate.of(2025, 4, 2),
                "A free tech workshop for beginners.",
                "Android Workshop",
                R.drawable.event2,
                R.drawable.event2
        ));

        events.add(new Event(
                "3",
                10.5f,
                100,
                "https://maps.google.com/?q=Convention+Center",
                "Convention Center",
                LocalDate.of(2025, 5, 10),
                "Annual business and networking conference.",
                "Business Meetup",
                R.drawable.event3,
                R.drawable.event3
        ));

        events.add(new Event(
                "4",
                5.0f,
                20,
                "https://maps.google.com/?q=Community+Hall",
                "Community Hall",
                LocalDate.of(2025, 6, 1),
                "Evening yoga and meditation session.",
                "Yoga Night",
                R.drawable.event4,
                R.drawable.event4
        ));
        events.add(new Event(
                "5",
                50.0f,
                200,
                "https://maps.google.com/?q=Stadium",
                "Community Hall",
                LocalDate.of(2025, 7, 20),
                "Live concert with popular local bands.",
                "Summer Concert",
                R.drawable.event4,
                R.drawable.event4
        ));

        return events;
    }
    public static ArrayList<News> getNews() {
        ArrayList<News> newsList = new ArrayList<>();

        newsList.add(new News(
                "1",
                "The city announced new development plans for the downtown area.",
                R.drawable.news1,
                "City Development Update",
                "https://www.linkedin.com/in/rayen-ben-youssef-a7b727361"
        ));

        newsList.add(new News(
                "2",
                "Android 15 introduces performance improvements and new privacy features.",
                R.drawable.news2,
                "Android 15 Released",
                "https://api.memegen.link/images/rollsafe/When_you_have_a_really_good_idea.webp?layout=top&width=800&token=orgyyu0tuzir7n4ktwvc"
        ));

        newsList.add(new News(
                "3",
                "Local football team wins the championship after a dramatic final.",
                R.drawable.news3,
                "Championship Victory",
                "https://www.gruppolife.com/Media/Blog/You%26Meme/you-and-meme.png"
        ));

        newsList.add(new News(
                "4",
                "Weather experts predict a hotter-than-usual summer this year.",
                R.drawable.news4,
                "Summer Heat Alert",
                "https://www.linkedin.com/in/rayen-ben-youssef-a7b727361"
        ));

        newsList.add(new News(
                "5",
                "Community clean-up event scheduled for this weekend.",
                R.drawable.news5,
                "Community Event",
                "https://lh6.googleusercontent.com/proxy/bfKZVnWuUQiSAN9DEruLRbRMO26SVO7rWVb_gK4y2hgjkcY_-Ou_4QWFzK1cYtothXSNSebVbZE9anB-kfuxoN2pI3k5FnH2tM6A4WGrURcXq9oE4w"
        ));
        return newsList;
    }

    public static boolean signup(String fullname,String nID,String email,String phoneNumber,LocalDate bDate){

        return true;
    }

    public static boolean login(String email,String password){

        return true;
    }

    public static void resetPassword(String email){

    }
    public static Member getProfileInfo(){
        Member profile1=new Member(1111111,
                LocalDate.now(),
                "Active",
                "Admin",
                "52925815",
                "Ben youssef",
                "Rayen",
                "12345678",
                "rayenbenyoussef815@gmail.com");

        return profile1;
    }

    public static boolean updateProfile(String fullname,String phoneNumber,String password){

        return true;
    }

    public static boolean registerInEvent(String token,String event_id){

        return true;
    }

    public static boolean confirmRegistration(String token,String event_id){

        return true;
    }

    public static boolean cancelRegistration(String token,String event_id){

        return true;
    }

    public static Participation getParticipationInfo(String token,String eventId){
        Participation participation = new Participation(
                "1",
                "101",
                "present",
                LocalDateTime.now(),
                "Organizer"
        );

        return participation;

    }

}

