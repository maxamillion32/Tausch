package com.scu.tausch.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scu.tausch.R;
/**
 * Created by Praneet on 1/29/16.
 */
public class MyMessagesFragment extends Fragment{

    public MyMessagesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //DO NOT DELETE FOLLOWING CODE
        //ChatFragment nextFrag= new ChatFragment();

        // Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
        // Commit the transaction

//        this.getFragmentManager().beginTransaction()
//                .replace(R.id.myMessagesWindow, nextFrag)
//                .addToBackStack(null)
//                .commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mymessages, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
