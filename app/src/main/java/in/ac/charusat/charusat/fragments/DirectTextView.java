package in.ac.charusat.charusat.fragments;


import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;


@Parent
@SingleTop
@Layout(R.layout.text_only_feed_item)
class DirectTextView {

    @View(R.id.detail_content_textView)
    AppCompatTextView mContentTextView;

    @ParentPosition
    int mParentPosition;

    private Context mContext;
    private Detail mDetail;

    public DirectTextView(Context context, Detail detail) {
        mContext = context;
        mDetail = detail;
    }

    @Resolve
    void onResolved() {
        mContentTextView.setText(mDetail.getContentResId());
    }

}
