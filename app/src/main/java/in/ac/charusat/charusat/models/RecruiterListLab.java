package in.ac.charusat.charusat.models;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;

public class RecruiterListLab {
    private static RecruiterListLab sRecruiterListLab;

    private ArrayList<InfoList> mITRecruitersList;

    public static RecruiterListLab getInstance() {
        if(sRecruiterListLab == null)
            sRecruiterListLab = new RecruiterListLab();
        return sRecruiterListLab;
    }

    private RecruiterListLab() {
        addITRecruiters();
    }

    private void addITRecruiters() {
        mITRecruitersList = new ArrayList<>();
        mITRecruitersList.add(new InfoList(R.drawable.tcs, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.acty_system, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.crestdata, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.e_infochip, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.gateway, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.indian_navy, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.indusa, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.infostrech, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.infotech, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.sibridge, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.synoverge, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.tatvasoft, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.volansys, R.string.about_us));
        mITRecruitersList.add(new InfoList(R.drawable.vr_software, R.string.about_us));
    }

    public ArrayList<InfoList> getITRecruitersList() {
        return mITRecruitersList;
    }
}
