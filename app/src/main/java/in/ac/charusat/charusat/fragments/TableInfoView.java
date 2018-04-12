package in.ac.charusat.charusat.fragments;

import android.content.Context;

import com.levitnudi.legacytableview.LegacyTableView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;
import in.ac.charusat.charusat.models.TableListLab;

@Layout(R.layout.only_table_feed_item)
class TableInfoView {


    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.table_view)
    LegacyTableView legacyTableView;

    private Detail mDetail;
    private Context mContext;
    private String[] mTitleArray, mContentArray;

    private final TableListLab mTableListLab;

    public TableInfoView(Context context, Detail detail) {
        mContext = context;
        mDetail = detail;
        mTableListLab = TableListLab.getInstance();

    }

    @Resolve
    void onResolved() {
        //TODO: Solve table bug
        mTitleArray = mTableListLab.getTableInfoList(mDetail.getTableType()).get(0);
        mContentArray = mTableListLab.getTableInfoList(mDetail.getTableType()).get(1);
        LegacyTableView.insertLegacyTitle(mTitleArray);
        LegacyTableView.insertLegacyContent(mContentArray);
        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
        legacyTableView.setContent(LegacyTableView.readLegacyContent());
        legacyTableView.setTablePadding(9);
        legacyTableView.setTitleTextSize(32);
        legacyTableView.setContentTextSize(28);
        legacyTableView.build();

    }

}