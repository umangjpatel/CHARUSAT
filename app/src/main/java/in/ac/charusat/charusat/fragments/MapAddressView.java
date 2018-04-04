package in.ac.charusat.charusat.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
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
@Layout(R.layout.map_text_feed_item)
class MapAddressView {

    @View(R.id.address_imageView)
    AppCompatImageView mMapImageView;

    @View(R.id.address_textView)
    AppCompatTextView mAddressTextView;

    @ParentPosition
    int mParentPosition;

    private Context mContext;
    private Detail mDetail;

    public MapAddressView(Context context, Detail detail) {
        mContext = context;
        mDetail = detail;
    }

    @Resolve
    void onResolved() {
        mMapImageView.setImageResource(mDetail.getImageResId());
        mAddressTextView.setText(mDetail.getContentResId());

        mMapImageView.setOnClickListener(v -> {
            Uri geoLocation = Uri.parse("geo:22.599643, 72.820371");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW);
            mapIntent.setData(geoLocation);
            if (mapIntent.resolveActivity(mContext.getPackageManager()) != null) {
                mContext.startActivity(mapIntent);
            }


        });
    }

}
