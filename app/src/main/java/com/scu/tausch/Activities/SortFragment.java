package com.scu.tausch.Activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.scu.tausch.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Praneet on 2/11/16.
 */
public class SortFragment extends Fragment {
    public SortFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sort, container, false);

        Spinner spinnerCategory = (Spinner)rootView.findViewById(R.id.spinner_category);
        Spinner spinnerCondition = (Spinner)rootView.findViewById(R.id.spinner_condition);
        Button searchButton = (Button)rootView.findViewById(R.id.button_search);
        Button cancelButton = (Button)rootView.findViewById(R.id.button_cancel);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity().getBaseContext(),"Code to search on parse",Toast.LENGTH_SHORT).show();

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MenuFragment nextFrag= new MenuFragment();

                SortFragment.this.getFragmentManager().beginTransaction()
                        .replace(R.id.container_body, nextFrag)
                        .commit();


            }
        });


        List<String> categories = new ArrayList<>();
        categories.add("Automobiles");
        categories.add("Books");
        categories.add("Laptops");
        categories.add("Rentals");

        List<String> conditions = new ArrayList<>();
        conditions.add("New");
        conditions.add("Used");

        ArrayAdapter<String> adapterCategories = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, categories);
        adapterCategories.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerCategory.setAdapter(adapterCategories);

        ArrayAdapter<String> adapterConditions = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, conditions);
        adapterConditions.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerCondition.setAdapter(adapterConditions);


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