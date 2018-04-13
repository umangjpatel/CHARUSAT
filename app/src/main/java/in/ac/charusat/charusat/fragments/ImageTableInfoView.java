package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;

import com.levitnudi.legacytableview.LegacyTableView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;
import in.ac.charusat.charusat.models.TableListLab;

import static android.view.View.*;
import static android.view.View.GONE;

@Layout(R.layout.images_table_feed_item)
class ImageTableInfoView {


    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.detail_imageView)
    AppCompatImageView firstImageView;

    @View(R.id.top_placements_textView)
    AppCompatTextView topPlacementsTextView;

    @View(R.id.image_table_view)
    LegacyTableView legacyTableView;

    private TableListLab mTableListLab;

    private Detail mDetail;
    private Context mContext;

    private ArrayList<String> mTitleArray, mContentArray;

    ImageTableInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
        mTitleArray = new ArrayList<>();
        mContentArray = new ArrayList<>();
        mTableListLab = TableListLab.getInstance();
    }

    @Resolve
    void onResolved() {
        if (mDetail.getImageResId() == 0) {
            firstImageView.setVisibility(GONE);
            topPlacementsTextView.setVisibility(GONE);
        } else {
            firstImageView.setVisibility(VISIBLE);
            firstImageView.setImageResource(mDetail.getImageResId());
            topPlacementsTextView.setVisibility(VISIBLE);
        }


        if (mDetail.getTableType().equals(Detail.TOP_PLACEMENT)) {
            mTitleArray.add("Year");
            mTitleArray.add("ID");
            mTitleArray.add("Student Name");
            mTitleArray.add("Company");
            mTitleArray.add("Package Offered(Rs.)");

            mContentArray.clear();
            mContentArray.add("2017-18");
            mContentArray.add("14IT120");
            mContentArray.add("Harsh Shah");
            mContentArray.add("TCS");
            mContentArray.add("6.33 Lakhs");
            mContentArray.add("2016-17");
            mContentArray.add("13IT116");
            mContentArray.add("Neti Sheth");
            mContentArray.add("Opshub");
            mContentArray.add("6.37 Lakhs");
            mContentArray.add(" ");
            mContentArray.add("13IT126");
            mContentArray.add("Shreya Ttripathi");
            mContentArray.add("Opshub");
            mContentArray.add("6.37 Lakhs");
            mContentArray.add("2014-15");
            mContentArray.add("11IT010");
            mContentArray.add("Maharshi Bodani");
            mContentArray.add("GSFC Ltd.");
            mContentArray.add("9.1 Lakhs");
            mContentArray.add(" ");
            mContentArray.add("11IT109");
            mContentArray.add("Parth Shah");
            mContentArray.add("GSFC Ltd.");
            mContentArray.add("9.1 Lakhs");

            LegacyTableView.insertLegacyTitle(mTitleArray.toArray(new String[mTitleArray.size()]));
            //set table contents as string arrays
            LegacyTableView.insertLegacyContent(mContentArray.toArray(new String[mContentArray.size()]));
            legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
            legacyTableView.setContent(LegacyTableView.readLegacyContent());
            legacyTableView.setTablePadding(7);
            legacyTableView.setTitleTextSize(32);
            legacyTableView.setContentTextSize(28);
            legacyTableView.build();
        } else {
            String[] titleArray = mTableListLab.getTableInfoList(mDetail.getTableType()).get(0);
            String[] contentArray = mTableListLab.getTableInfoList(mDetail.getTableType()).get(1);

            LegacyTableView.insertLegacyTitle(titleArray);
            //set table contents as string arrays
            LegacyTableView.insertLegacyContent(contentArray);
            legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
            legacyTableView.setContent(LegacyTableView.readLegacyContent());
            legacyTableView.setTablePadding(7);
            legacyTableView.setTitleTextSize(32);
            legacyTableView.setContentTextSize(28);
            legacyTableView.build();
        }

    }


}
