package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.InfoList;
import in.ac.charusat.charusat.models.RecruiterListLab;

@Parent
@SingleTop
@Layout(R.layout.recruiters_list_layout)
public class RecruitersInfoView {

    @View(R.id.recruiters_list_recyclerView)
    RecyclerView mRecruiterListRecyclerView;

    @ParentPosition
    int mParentPosition;

    private Context mContext;

    private RecruiterListLab mRecruitersListLab;
    private ArrayList<InfoList> mRecruitersList;
    private RecruiterAdapter mRecruitersAdapter;

    public RecruitersInfoView(Context context, RecruiterListLab detail) {
        mContext = context;
        mRecruitersListLab = detail;
    }

    private class RecruiterHolder extends RecyclerView.ViewHolder {

        private AppCompatImageView mInfoImageView;
        private AppCompatTextView mInfoTitleTextView;
        private InfoList mInfo;

        public RecruiterHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.recruiters_list_item, parent, false));
            mInfoImageView = itemView.findViewById(R.id.info_imageView);
            mInfoTitleTextView = itemView.findViewById(R.id.info_title_textView);
        }

        public void bind(InfoList info) {
            mInfo = info;
            mInfoImageView.setImageResource(mInfo.getImageResId());
            mInfoTitleTextView.setText(mInfo.getTitleResId());
        }
    }

    private class RecruiterAdapter extends RecyclerView.Adapter<RecruiterHolder> {

        @NonNull
        @Override
        public RecruiterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new RecruiterHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull RecruiterHolder holder, int position) {
            InfoList info = mRecruitersList.get(position);
            holder.bind(info);
        }

        @Override
        public int getItemCount() {
            return mRecruitersList.size();
        }
    }

    @Resolve
    void onResolved() {
        mRecruitersList = mRecruitersListLab.getITRecruitersList();
        mRecruiterListRecyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        if (mRecruitersAdapter == null)
            mRecruitersAdapter = new RecruiterAdapter();
        else
            mRecruitersAdapter.notifyDataSetChanged();
        mRecruiterListRecyclerView.setHasFixedSize(true);
        mRecruiterListRecyclerView.setAdapter(mRecruitersAdapter);
    }

}
