package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

/**
 * Class that binds the child views
 */

@Layout(R.layout.text_only_feed_item)
class InfoView {
    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.detail_content_textView)
    TextView titleTxt;

    private Detail mDetail;
    private Context mContext;

    InfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        titleTxt.setText(mDetail.getContentResId());
    }
}
