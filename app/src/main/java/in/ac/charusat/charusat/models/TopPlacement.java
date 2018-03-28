package in.ac.charusat.charusat.models;

import android.os.Parcel;
import android.os.Parcelable;

public class TopPlacement implements Parcelable {

    private String mYear, mId, mName, mCompany, mPackage;

    public TopPlacement(String year, String id, String name, String company, String aPackage) {
        mYear = year;
        mId = id;
        mName = name;
        mCompany = company;
        mPackage = aPackage;
    }

    protected TopPlacement(Parcel in) {
        mYear = in.readString();
        mId = in.readString();
        mName = in.readString();
        mCompany = in.readString();
        mPackage = in.readString();
    }

    public static final Creator<TopPlacement> CREATOR = new Creator<TopPlacement>() {
        @Override
        public TopPlacement createFromParcel(Parcel in) {
            return new TopPlacement(in);
        }

        @Override
        public TopPlacement[] newArray(int size) {
            return new TopPlacement[size];
        }
    };

    public String getYear() {
        return mYear;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getCompany() {
        return mCompany;
    }

    public String getPackage() {
        return mPackage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mYear);
        dest.writeString(mId);
        dest.writeString(mName);
        dest.writeString(mCompany);
        dest.writeString(mPackage);
    }
}
