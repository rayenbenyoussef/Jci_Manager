package com.example.jcimanager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {
    public EventsFragment() {
        // Required empty public constructor
    }
    public static EventsFragment newInstance() {
        EventsFragment fragment = new EventsFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView rv=view.findViewById(R.id.events_recycler_view);

        ArrayList<Event> events=new ArrayList<>();
        events.add(new Event(
                1,
                20.0f,
                50,
                "https://maps.google.com/?q=Central+Park",
                "Central Park",
                LocalDate.of(2025, 3, 15),
                "Join us for a fun outdoor gathering with music and food.",
                "Spring Festival",
                R.drawable.event1
        ));

        events.add(new Event(
                2,
                0.0f,
                30,
                "https://maps.google.com/?q=City+Library",
                "City Library",
                LocalDate.of(2025, 4, 2),
                "A free tech workshop for beginners.",
                "Android Workshop",
                R.drawable.event2
        ));

        events.add(new Event(
                3,
                10.5f,
                100,
                "https://maps.google.com/?q=Convention+Center",
                "Convention Center",
                LocalDate.of(2025, 5, 10),
                "Annual business and networking conference.",
                "Business Meetup",
                R.drawable.event3
        ));

        events.add(new Event(
                4,
                5.0f,
                20,
                "https://maps.google.com/?q=Community+Hall",
                "Community Hall",
                LocalDate.of(2025, 6, 1),
                "Evening yoga and meditation session.",
                "Yoga Night",
                R.drawable.event4
        ));
        events.add(new Event(
                5,
                50.0f,
                200,
                "https://maps.google.com/?q=Stadium",
                "Community Hall",
                LocalDate.of(2025, 7, 20),
                "Live concert with popular local bands.",
                "Summer Concert",
                R.drawable.event4
        ));
        EventAdapter adapter=new EventAdapter(events);
        RecyclerView.LayoutManager rvManager=new LinearLayoutManager(getContext());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(rvManager);
        rv.setAdapter(adapter);
    }
}