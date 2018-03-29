package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.Collapse;
import com.mindorks.placeholderview.annotations.expand.Expand;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;
import com.mindorks.placeholderview.annotations.expand.Toggle;

import in.ac.charusat.charusat.R;

/**
 * Class managing the binding of item views and its operations
 */


@Parent
@SingleTop
@Layout(R.layout.feed_heading)
class HeadingView {

    @View(R.id.detail_heading_textView)
    TextView headingTxt;

    @View(R.id.toggleIcon)
    ImageView toggleIcon;

    @Toggle(R.id.heading_toggleView)
    LinearLayout toggleView;

    @ParentPosition
    int mParentPosition;

    private Context mContext;
    private int mHeading;

    public HeadingView(Context context, int heading) {
        mContext = context;
        mHeading = heading;
    }

    @Resolve
    void onResolved() {
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_arrow_down));
        headingTxt.setText(mHeading);
    }

    @Expand
    void onExpand() {
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_arrow_up));
    }

    @Collapse
    void onCollapse() {
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_arrow_down));
    }

}
