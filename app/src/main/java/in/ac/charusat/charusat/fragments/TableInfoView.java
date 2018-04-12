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

@Layout(R.layout.only_table_feed_item)
class TableInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.table_view)
    static LegacyTableView legacyTableView;

    private Detail mDetail;
    private Context mContext;

    private String[] mTitleArray, mContentArray;

    TableInfoView(Context context, String[] titles, String[] contents) {
        mContext = context;
        mTitleArray = titles;
        mContentArray = contents;
    }

    @Resolve
    void onResolved() {
        legacyTableView.loadUrl("about:blank");
        legacyTableView.clearCache(true);
        legacyTableView.clearHistory();
        //TODO: Solve table bug
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
