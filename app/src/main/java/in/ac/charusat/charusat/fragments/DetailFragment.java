package in.ac.charusat.charusat.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mindorks.placeholderview.ExpandablePlaceHolderView;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    private static final String ARG_DETAIL_LIST = "arg_detail_list";

    private ArrayList<Detail> mDetails;
    private ExpandablePlaceHolderView mExpandableView;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        //Loading IT list item
        mDetails = getArguments().getParcelableArrayList(ARG_DETAIL_LIST);
        //Display items in expandable recyclerview
        mExpandableView = view.findViewById(R.id.detail_expandable_view);
        for (Detail detail : mDetails) {
            switch (detail.getType()) {
                case Detail.ONLY_TEXT_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new InfoView(getActivity(), detail));
                    break;
                case Detail.IMAGE_TEXT_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new ImageTextInfoView(getActivity(), detail));
                    break;
                case Detail.ONLY_IMAGE_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new ImageOnlyInfoView(getActivity(), detail));
                    break;
                case Detail.TWO_IMAGES_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new ImageTableInfoView(getActivity(), detail));
                    break;
                case Detail.DIRECT_TEXT_TYPE:
                    mExpandableView.addView(new DirectTextView(getActivity(), detail));
                    break;
                case Detail.FACULTY_INFO_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new FacultyInfoView(getActivity(), detail));
                    break;
                case Detail.MAP_ADDRESS_TYPE:
                    mExpandableView.addView(new MapAddressView(getActivity(), detail));
                    break;
                case Detail.ONLY_TABLE_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new TableInfoView(getActivity(), detail));
                    break;
                case Detail.IMAGE_TABLE_TYPE:
                    mExpandableView.addView(new HeadingView(getActivity(), detail.getHeaderResId()));
                    mExpandableView.addView(new ImageTableInfoView(getActivity(), detail));
                    break;
            }
        }

        return view;
    }

    public static Fragment newInstance(ArrayList<Detail> details) {
        Bundle args = new Bundle();
        args.putParcelableArrayList(ARG_DETAIL_LIST, details);
        Fragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
