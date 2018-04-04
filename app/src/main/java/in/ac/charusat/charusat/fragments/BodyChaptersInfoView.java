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

@Layout(R.layout.body_chapters_feed_item)
class BodyChaptersInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.chapter_full_form_textView)
    AppCompatTextView fullFormTextView;

    @View(R.id.chapter_info_textView)
    AppCompatTextView infoTextView;

    @View(R.id.chapter_imageView)
    AppCompatImageView imageView;

    private Detail mDetail;
    private Context mContext;

    BodyChaptersInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        imageView.setImageResource(mDetail.getImageResId());
        infoTextView.setText(mDetail.getContentResId());
        fullFormTextView.setText(mDetail.getExtraContentResId());
    }

}
