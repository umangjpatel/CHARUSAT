package in.ac.charusat.charusat.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import in.ac.charusat.charusat.R;

public class AndroidImageAdapter extends PagerAdapter {
    private Context mContext;

    public AndroidImageAdapter(Context context) {
        mContext = context;
    }
    private int[] sliderImagesId = new int[]{
            R.drawable.charusat_banner,R.drawable.view_two,R.drawable.view_one,R.drawable.view_three,R.drawable.view_four,R.drawable.view_five
    };

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View v, @NonNull Object obj) {
        return v == obj;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mImageView.setImageResource(sliderImagesId[i]);
        container.addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int i, @NonNull Object obj) {
        container.removeView((ImageView) obj);
    }
}
