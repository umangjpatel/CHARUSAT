package in.ac.charusat.charusat.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model class used for holding an instance of detail article
 */

public class Detail implements Parcelable {

    public static final int ONLY_TEXT_TYPE = 0, IMAGE_TEXT_TYPE = 1, ONLY_IMAGE_TYPE = 2, TABLE_VIEW_TYPE = 3;

    private int mType, mHeaderResId, mContentResId, mImageResId;

    public Detail(int type, int headerResId, int contentResId) {
        mType = type;
        mHeaderResId = headerResId;
        mContentResId = contentResId;
    }

    public Detail(int type, int headerResId, int contentResId, int imageResId) {
        mType = type;
        mHeaderResId = headerResId;
        mContentResId = contentResId;
        mImageResId = imageResId;
    }

    public Detail(int type, int headerResId, int imageResId, boolean isImageOnly) {
        mType = type;
        mImageResId = imageResId;
        mHeaderResId = headerResId;
    }

    protected Detail(Parcel in) {
        mType = in.readInt();
        mHeaderResId = in.readInt();
        mContentResId = in.readInt();
        mImageResId = in.readInt();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public int getType() {
        return mType;
    }

    public int getHeaderResId() {
        return mHeaderResId;
    }

    public int getContentResId() {
        return mContentResId;
    }

    public int getImageResId() {
        return mImageResId;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mType);
        dest.writeInt(mHeaderResId);
        dest.writeInt(mContentResId);
        dest.writeInt(mImageResId);
    }
}
