package in.ac.charusat.charusat.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import in.ac.charusat.charusat.R;

/**
 * Singleton class for storing info list data items
 */

public class InfoListLab {
    private static InfoListLab sInfoListLab;
    private List<InfoList> mInfoLists;
    private HashMap<String, String> mToolbarTitlesList;


    public static InfoListLab getInstance() {
        if (sInfoListLab == null)
            sInfoListLab = new InfoListLab();
        return sInfoListLab;
    }

    private InfoListLab() {
        addInfoData();
        adToolbarTitlesData();

    }

    private void adToolbarTitlesData() {
        mToolbarTitlesList = new HashMap<>();
        mToolbarTitlesList.put("IT", "Information Technology");
        mToolbarTitlesList.put("CE", "Computer Engineering");
        mToolbarTitlesList.put("ME", "Mechanical Engineering");
        mToolbarTitlesList.put("EE", "Electrical Engineering");
        mToolbarTitlesList.put("EC", "Electronic and Communication");
        mToolbarTitlesList.put("CL", "Civil Engineering");
    }


    private void addInfoData() {
        mInfoLists = new ArrayList<>();
        mInfoLists.add(new InfoList(R.drawable.ic_university, R.string.it_about_institute));
        mInfoLists.add(new InfoList(R.drawable.ic_test, R.string.admission_stats));
        mInfoLists.add(new InfoList(R.drawable.ic_graduation, R.string.placement));
        mInfoLists.add(new InfoList(R.drawable.ic_blackboard, R.string.resources));
        mInfoLists.add(new InfoList(R.drawable.ic_earth_globe, R.string.international_collab));
        mInfoLists.add(new InfoList(R.drawable.ic_certificate, R.string.ipr));
        mInfoLists.add(new InfoList(R.drawable.ic_presentation, R.string.best_practices));
        mInfoLists.add(new InfoList(R.drawable.ic_medal, R.string.students_achievements));
        mInfoLists.add(new InfoList(R.drawable.ic_diploma_1, R.string.grant));
        mInfoLists.add(new InfoList(R.drawable.ic_briefcase, R.string.pro_body_chapters));
        mInfoLists.add(new InfoList(R.drawable.ic_professor, R.string.faculty_information));
        mInfoLists.add(new InfoList(R.drawable.ic_school_bus, R.string.how_to_reach));
        mInfoLists.add(new InfoList(R.drawable.ic_school_bus,R.string.student_projects));
        mInfoLists.add(new InfoList(R.drawable.ic_school_bus,R.string.top_recruiters));
        mInfoLists.add(new InfoList(R.drawable.ic_id_card, R.string.about_developers));
    }


    public List<InfoList> getInfoLists() {
        return mInfoLists;
    }

    public String getToolbarTitle(String deptName) {
        return mToolbarTitlesList.get(deptName);
    }
}