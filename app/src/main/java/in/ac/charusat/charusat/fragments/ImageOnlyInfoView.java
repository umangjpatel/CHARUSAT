package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

@Layout(R.layout.image_only_feed_item)
class ImageOnlyInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.detail_only_imageView)
    AppCompatImageView imageView;

    private Detail mDetail;
    private Context mContext;

    ImageOnlyInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        imageView.setImageResource(mDetail.getImageResId());
    }

}
