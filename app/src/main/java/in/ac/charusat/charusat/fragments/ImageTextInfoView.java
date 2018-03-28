package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

/**
 * Class that manages the layout of image and text feed item.
 * Created by iharsh on 26/3/18.
 */

@Layout(R.layout.image_text_feed_item)
class ImageTextInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.detail_image_content_textView)
    AppCompatTextView titleTxt;

    @View(R.id.detail_imageView)
    AppCompatImageView imageView;

    private Detail mDetail;
    private Context mContext;

    ImageTextInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        imageView.setImageResource(mDetail.getImageResId());
        titleTxt.setText(mDetail.getContentResId());
    }

}
