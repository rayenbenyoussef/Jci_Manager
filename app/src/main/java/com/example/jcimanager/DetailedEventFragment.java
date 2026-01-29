package com.example.jcimanager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalDate;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailedEventFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailedEventFragment extends Fragment {
    private static final String ARG_EVENTTITLE = "event title";
    private static final String ARG_EVENTDESC = "event description";
    private static final String ARG_EVENTIMG = "event image";
    private static final String ARG_EVENTCOVER = "event cover image";
    private static final String ARG_EVENTLOC = "event location";
    private static final String ARG_EVENTLOCLINK = "event location link";
    private static final String ARG_EVENTDATE = "event date";
    private static final String ARG_EVENTFEES = "event fees";
    private static final String ARG_EVENTMAX= "event max participations";

    private String eventTitle;
    private String eventDesc ;
    private int eventImg;
    private int eventCover;
    private String eventLoc ;
    private String eventLocLink;
    private LocalDate eventDate;
    private float eventFees;
    private int eventMax;

    public DetailedEventFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static DetailedEventFragment newInstance(String eventTitle,String eventDesc ,int eventImg, int eventCover, String eventLoc , String eventLocLink, LocalDate eventDate, float eventFees, int eventMax) {
        DetailedEventFragment fragment = new DetailedEventFragment();
        Bundle args = new Bundle();;
        args.putString(ARG_EVENTTITLE, eventTitle);
        args.putString(ARG_EVENTDESC, eventDesc);
        args.putInt(ARG_EVENTIMG , eventImg);
        args.putInt(ARG_EVENTCOVER, eventCover);
        args.putString(ARG_EVENTLOC , eventLoc);
        args.putString(ARG_EVENTLOCLINK , eventLocLink);
        args.putString(ARG_EVENTDATE, eventDate.toString());
        args.putFloat(ARG_EVENTFEES, eventFees);
        args.putInt(ARG_EVENTMAX, eventMax);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Bundle args = getArguments();

            eventTitle = args.getString(ARG_EVENTTITLE);
            eventDesc = args.getString(ARG_EVENTDESC);
            eventCover = args.getInt(ARG_EVENTCOVER);
            eventLoc = args.getString(ARG_EVENTLOC);
            eventLocLink = args.getString(ARG_EVENTLOCLINK);

            eventImg = args.getInt(ARG_EVENTIMG);
            eventMax = args.getInt(ARG_EVENTMAX);
            eventFees = args.getFloat(ARG_EVENTFEES);

            eventDate = LocalDate.parse(args.getString(ARG_EVENTDATE));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed_event, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView img=view.findViewById(R.id.devent_image);
        img.setImageResource(eventImg);
        ImageView coverImg=view.findViewById(R.id.devent_cover);
        coverImg.setImageResource(eventCover);
        TextView title=view.findViewById(R.id.devent_title);
        title.setText(eventTitle);
        TextView desc=view.findViewById(R.id.devent_description);
        desc.setText(eventDesc);
        TextView date=view.findViewById(R.id.devent_date);
        date.setText(eventDate.toString());
        TextView loc=view.findViewById(R.id.devent_location);
        loc.setText(eventLoc);
        TextView fees=view.findViewById(R.id.dfees);
        fees.setText(Float.toString(eventFees));
        TextView max=view.findViewById(R.id.dmax_part);
        max.setText(Integer.toString(eventMax));
    }
}