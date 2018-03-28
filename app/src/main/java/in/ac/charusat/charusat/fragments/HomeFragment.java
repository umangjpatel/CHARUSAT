package in.ac.charusat.charusat.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.activities.InfoListActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private AppCompatSpinner mInstituteSpinner, mDeptSpinner;
    private ArrayAdapter<CharSequence> mInstituteAdapter, mDeptAdapter;
    private AppCompatButton mInfoListButton;

    private String mDeptName;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mInstituteSpinner = view.findViewById(R.id.institute_spinner);
        mDeptSpinner = view.findViewById(R.id.dept_spinner);
        mInfoListButton = view.findViewById(R.id.info_list_button);

        mInfoListButton.setOnClickListener((v) -> {
            Intent intent = InfoListActivity.newIntent(getActivity(), mDeptName);
            startActivity(intent);
        });

        setSpinnerItems();
        return view;
    }

    private void setSpinnerItems() {
        mInstituteAdapter = ArrayAdapter
                .createFromResource(getActivity(), R.array.institutes_array, android.R.layout.simple_spinner_item);
        mInstituteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mInstituteSpinner.setAdapter(mInstituteAdapter);
        mDeptAdapter = ArrayAdapter
                .createFromResource(getActivity(), R.array.departments_array, android.R.layout.simple_spinner_item);
        mDeptAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mDeptSpinner.setAdapter(mDeptAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();

        //TODO : Implement dropdown options
        mInstituteSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //An item was selected. You can retrieve the selected item using parent.getItemAtPosition(position)
                String item = (String) parent.getItemAtPosition(position);
                //Toast.makeText(getActivity(), item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Nothing was selected
            }
        });

        mDeptSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mDeptName = "IT";
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mDeptName = "IT";
            }
        });
    }
}
