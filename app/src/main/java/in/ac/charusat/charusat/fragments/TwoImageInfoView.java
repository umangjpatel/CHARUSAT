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

@Layout(R.layout.two_images_feed_item)
class TwoImageInfoView {

        @ParentPosition
        int mParentPosition;

        @ChildPosition
        int mChildPosition;

        @View(R.id.detail_first_imageView)
        AppCompatImageView firstImageView;

        @View(R.id.detail_second_imageView)
        AppCompatImageView secondImageView;

        private Detail mDetail;
        private Context mContext;

        TwoImageInfoView(Context context, Detail info) {
            mContext = context;
            mDetail = info;
        }

        @Resolve
        void onResolved() {
            firstImageView.setImageResource(mDetail.getFirstImageResId());
            secondImageView.setImageResource(mDetail.getSecondImageResId());
        }


}
