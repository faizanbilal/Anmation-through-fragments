package com.example.assignment2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentb#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentb extends Fragment {
    ImageView img_view;
    AnimationDrawable ad;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragmentb() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmentb.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmentb newInstance(String param1, String param2) {
        fragmentb fragment = new fragmentb();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        img_view=getActivity().findViewById(R.id.img_view);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmentb, container, false);
    }
    public void doanimation(int val) {
        img_view.setImageDrawable(null);
        img_view.setBackground(null);
        img_view.clearAnimation();
        if (val==1){
            img_view.setBackgroundResource(R.drawable.attack_animation);
            ad = (AnimationDrawable) img_view.getBackground();
            ad.start();
            }
        else if (val == 2){
            img_view.setBackgroundResource(R.drawable.run_animation);
            ad = (AnimationDrawable) img_view.getBackground();
            ad.start();
            }
        else if (val == 3){
            img_view.setBackgroundResource(R.drawable.jump_animation);
            ad = (AnimationDrawable) img_view.getBackground();
            ad.start();
        }
        else if (val == 4){
            img_view.setBackgroundResource(R.drawable.idle_animation);
            ad = (AnimationDrawable) img_view.getBackground();
            ad.start();
        }
        else if (val == 5){
            img_view.setBackgroundResource(R.drawable.crouch_animation);
            ad = (AnimationDrawable) img_view.getBackground();
            ad.start();
        }
        }
}

