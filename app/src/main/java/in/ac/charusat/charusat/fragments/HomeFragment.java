package in.ac.charusat.charusat.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;

import java.util.Timer;
import java.util.TimerTask;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.activities.InfoListActivity;
import in.ac.charusat.charusat.adapters.AndroidImageAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private AppCompatSpinner mInstituteSpinner, mDeptSpinner;
    private ArrayAdapter<CharSequence> mInstituteAdapter, mDeptAdapter;
    private AppCompatButton mInfoListButton;

    private String mDeptName;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 200;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 2000;

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

        ViewPager mViewPager = view.findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(getContext());
        mViewPager.setAdapter(adapterView);
        final Handler handler = new Handler();
        final Runnable Update = () -> {
            mViewPager.setCurrentItem(currentPage, true);
            if(currentPage == Integer.MAX_VALUE){
                currentPage = 0;
            }else{
                currentPage++;
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);


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
