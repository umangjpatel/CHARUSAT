package in.ac.charusat.charusat.fragments;

import android.content.Context;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;
import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

@Layout(R.layout.table_feed_item)
class TableInfoView {
    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.table_view)
    TableView<String[]> mTableView;

    private Detail mDetail;
    private Context mContext;

    TableInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        String[][] DATA_TO_SHOW = { { "This", "is", "a", "test" },
                { "and", "a", "second", "test" } };
        String[] HEADER_TO_SHOW = { "This", "is", "a", "header" };
        mTableView.setHeaderAdapter(new SimpleTableHeaderAdapter(mContext, HEADER_TO_SHOW));
        mTableView.setDataAdapter(new SimpleTableDataAdapter(mContext, DATA_TO_SHOW));
    }

}
