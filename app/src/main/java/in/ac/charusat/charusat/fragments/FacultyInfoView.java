package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import de.hdodenhof.circleimageview.CircleImageView;
import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

@Layout(R.layout.faculty_info_feed_item)
class FacultyInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.faculty_qual_textView)
    AppCompatTextView qualText;

    @View(R.id.faculty_info_textView)
    AppCompatTextView infoText;

    @View(R.id.faculty_imageView)
    CircleImageView imageView;

    private Detail mDetail;
    private Context mContext;

    FacultyInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        imageView.setImageResource(mDetail.getImageResId());
        infoText.setText(mDetail.getContentResId());
        qualText.setText(mDetail.getExtraContentResId());
    }
}
