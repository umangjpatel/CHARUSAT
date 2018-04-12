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
        mITRecruitersList.add(new InfoList(R.drawable.tcs, R.string.tcs_text));
        mITRecruitersList.add(new InfoList(R.drawable.acty_system, R.string.acty_system_text));
        mITRecruitersList.add(new InfoList(R.drawable.crestdata,R.string.crest_system_text));
        mITRecruitersList.add(new InfoList(R.drawable.e_infochip, R.string.infochips_text));
        mITRecruitersList.add(new InfoList(R.drawable.gateway, R.string.gateway_text));
        mITRecruitersList.add(new InfoList(R.drawable.indian_navy, R.string.indian_navy_text));
        mITRecruitersList.add(new InfoList(R.drawable.indusa, R.string.indusa_text));
        mITRecruitersList.add(new InfoList(R.drawable.infostrech, R.string.inforstech_text));
        mITRecruitersList.add(new InfoList(R.drawable.infotech, R.string.infotech_text));
        mITRecruitersList.add(new InfoList(R.drawable.sibridge, R.string.sibridge_text));
        mITRecruitersList.add(new InfoList(R.drawable.synoverge, R.string.synoverge_text));
        mITRecruitersList.add(new InfoList(R.drawable.tatvasoft, R.string.tatvasoft_text));
        mITRecruitersList.add(new InfoList(R.drawable.volansys, R.string.volanysis_text));
        mITRecruitersList.add(new InfoList(R.drawable.vr_software, R.string.vr_text));
    }

    public ArrayList<InfoList> getITRecruitersList() {
        return mITRecruitersList;
    }
}
