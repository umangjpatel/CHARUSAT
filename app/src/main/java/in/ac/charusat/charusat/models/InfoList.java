package in.ac.charusat.charusat.models;

/**
 * Model class for holding one info list item.
 */

public class InfoList {
    private int mImageResId;
    private int mTitleResId;

    public InfoList(int imageResId, int titleResId) {
        mImageResId = imageResId;
        mTitleResId = titleResId;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }
}
