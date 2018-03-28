package in.ac.charusat.charusat.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.activities.DetailActivity;
import in.ac.charusat.charusat.models.DeptListLab;
import in.ac.charusat.charusat.models.Detail;
import in.ac.charusat.charusat.models.InfoList;
import in.ac.charusat.charusat.models.InfoListLab;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoListFragment extends Fragment {

    private static final String ARG_DEPT_NAME = "arg_dept_name";
    private List<InfoList> mInfoList;
    private ArrayList<ArrayList<Detail>> mDeptList;

    private RecyclerView mInfoRecyclerView;
    private InfoAdapter mInfoAdapter;
    private String mDeptName;

    private class InfoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private AppCompatImageView mInfoImageView;
        private AppCompatTextView mInfoTitleTextView;
        private InfoList mInfo;
        private ArrayList<Detail> mDetails;

        public InfoHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.info_list_item, parent, false));
            mInfoImageView = itemView.findViewById(R.id.info_imageView);
            mInfoTitleTextView = itemView.findViewById(R.id.info_title_textView);
            itemView.setOnClickListener(this);
        }

        public void bind(InfoList info, ArrayList<Detail> word) {
            mInfo = info;
            mDetails = word;
            mInfoImageView.setImageResource(mInfo.getImageResId());
            mInfoTitleTextView.setText(mInfo.getTitleResId());
        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
            Intent intent = DetailActivity.newIntent(getActivity(), mDetails);
            startActivity(intent);
        }
    }

    private class InfoAdapter extends RecyclerView.Adapter<InfoHolder> {

        @NonNull
        @Override
        public InfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new InfoHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull InfoHolder holder, int position) {
            InfoList info = mInfoList.get(position);
            ArrayList<Detail> detail = mDeptList.get(position);
            holder.bind(info, detail);
        }

        @Override
        public int getItemCount() {
            return mInfoList.size();
        }
    }


    public InfoListFragment() {
        // Required empty public constructor
    }


    public static Fragment newInstance(String deptName) {
        Bundle args = new Bundle();
        args.putString(ARG_DEPT_NAME, deptName);
        Fragment fragment = new InfoListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_list, container, false);

        //Fetches dept name from HomeFragment spinner view.
        mDeptName = getArguments().getString(ARG_DEPT_NAME);

        //TODO : To be removed after successful testing..Success
        Toast.makeText(getActivity(), mDeptName, Toast.LENGTH_SHORT).show();

        //Loading categories list data like about, how to reach, etc.
        mInfoList = InfoListLab.getInstance().getInfoLists();

        //Loading department items arraylist(0,1,2...) of arraylist of details(detail, detail)
        mDeptList = DeptListLab.getInstance().getDeptList(mDeptName);

        Toast.makeText(getActivity(), "List loaded successfully", Toast.LENGTH_SHORT).show();

        mInfoRecyclerView = view.findViewById(R.id.info_list_recyclerView);
        mInfoRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        setUpRecyclerView();

        return view;
    }

    private void setUpRecyclerView() {
        if (mInfoAdapter == null)
            mInfoAdapter = new InfoAdapter();
        else
            mInfoAdapter.notifyDataSetChanged();
        mInfoRecyclerView.setHasFixedSize(true);
        mInfoRecyclerView.setAdapter(mInfoAdapter);
    }
}
