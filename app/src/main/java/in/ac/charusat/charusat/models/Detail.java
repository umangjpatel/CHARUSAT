package in.ac.charusat.charusat.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model class used for holding an instance of detail article
 */

public class Detail implements Parcelable {

    public static final int ONLY_TEXT_TYPE = 0, IMAGE_TEXT_TYPE = 1, ONLY_IMAGE_TYPE = 2,
            TWO_IMAGES_TYPE = 3, MAP_ADDRESS_TYPE = 4, DIRECT_TEXT_TYPE = 5, ONLY_TABLE_TYPE = 6;

    public static final String BTECH_ADMIN = "btech", MTECH_ADMIN = "mtech", IPR = "ipr",
        CONSULTANCY = "consult";

    private int mType;
    private int mHeaderResId;
    private int mContentResId;
    private int mImageResId;
    private int mFirstImageResId;
    private int mSecondImageResId;
    private String mTableType;

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

    public Detail(int type, int headerResId, int firstImageResId, int secondImageResId, boolean isTwoImages) {
        mType = type;
        mHeaderResId = headerResId;
        mFirstImageResId = firstImageResId;
        mSecondImageResId = secondImageResId;
    }

    public Detail(int type, int headerResId, String tableType) {
        mType = type;
        mHeaderResId = headerResId;
        mTableType = tableType;
    }

    protected Detail(Parcel in) {
        mType = in.readInt();
        mHeaderResId = in.readInt();
        mContentResId = in.readInt();
        mImageResId = in.readInt();
        mFirstImageResId = in.readInt();
        mSecondImageResId = in.readInt();
        mTableType = in.readString();
    }

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

    public int getFirstImageResId() {
        return mFirstImageResId;
    }

    public int getSecondImageResId() {
        return mSecondImageResId;
    }

    public String getTableType() {
        return mTableType;
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
        dest.writeInt(mFirstImageResId);
        dest.writeInt(mSecondImageResId);
        dest.writeString(mTableType);
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

}
