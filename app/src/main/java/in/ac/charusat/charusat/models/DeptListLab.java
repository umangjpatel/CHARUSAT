package in.ac.charusat.charusat.models;

import java.util.ArrayList;
import java.util.HashMap;

import in.ac.charusat.charusat.R;

/**
 * Singleton class managing data of each department
 */

public class DeptListLab {
    private static DeptListLab sDeptListLab;
    private HashMap<String, ArrayList<ArrayList<Detail>>> mDeptList;
    private ArrayList<ArrayList<Detail>> mDetailList;

    public static DeptListLab getInstance() {
        if (sDeptListLab == null)
            sDeptListLab = new DeptListLab();
        return sDeptListLab;
    }

    private DeptListLab() {
        mDeptList = new HashMap<>();
        generateITDetailList();
        mDeptList.put("IT", mDetailList);
    }

    private void generateITDetailList() {
        mDetailList = new ArrayList<>();
        // 0th position
        for (int i = 0; i < 15; i++) {
            ArrayList<Detail> details = new ArrayList<>();

            switch (i) {
                case 1:
                    //TODO : Add btech and mtech admission stats table images
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.it_btech_admission_stats, R.drawable.acm_banner, true));
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.it_mtech_admission_stats, R.drawable.acm_banner, true));
                    break;
                case 2:
                    //TODO : Add placement graph and table image drawable resource ID below
                    details.add(new Detail(Detail.TWO_IMAGES_TYPE, R.string.placement_heading_label, R.drawable.charusat_banner, R.drawable.acm_banner, true));
                    //TODO : Add higher studies stats table image drawable resource ID below
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.higher_studies_heading_label, R.drawable.acm_banner, true));
                    break;
                case 3:
                    //TODO : Add new Sophos Lab Image
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_sophos, R.string.it_resource_sophos, R.drawable.resource_1));
                    //TODO : Add new VR Lab Image
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_vr, R.string.it_resource_vr, R.drawable.resource_2));
                    //TODO : Add new Pearson Vue Exam Centre Image
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_pearson, R.string.it_resource_pearson, R.drawable.resource_2));
                    //TODO : Add new Mac Lab Image
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_labs, R.string.it_resource_labs, R.drawable.resource_1));
                    //TODO : Add new MM Hall image
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_mm_hall, R.string.it_resource_mm_hall, R.drawable.resource_3));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_internet_lab, R.string.it_resource_internet_lab, R.drawable.resource_4));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_server_room, R.string.it_resource_server_room, R.drawable.resource_5));
                    break;
                case 4:
                    details.add(new Detail(Detail.DIRECT_TEXT_TYPE, 0, R.string.it_collaborations));
                    break;
                case 5:
                    //TODO : Add Publication Summary table image
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.it_publications, R.drawable.acm_banner, true));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_book_publication, R.string.it_detail_book_publication));
                    break;
                case 6:
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_counselling, R.string.it_detail_counselling));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_mooc, R.string.it_detail_mooc));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_ict, R.string.it_detail_ict));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_evaluation, R.string.it_detail_evaluation));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_curricular, R.string.it_detail_curricular));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_expert_sessions, R.string.it_detail_expert_sessions));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_faculty_industry, R.string.it_detail_faculty_industry));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_new_practicals, R.string.it_detail_new_practicals));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_dept_website, R.string.it_detail_dept_website));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_pre_placement, R.string.it_detail_pre_placement));
                    break;
                case 7:
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_1, R.string.it_detail_achievement_1));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_2, R.string.it_detail_achievement_2));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_3, R.string.it_detail_achievement_3));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_4, R.string.it_detail_achievement_4));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_5, R.string.it_detail_achievement_5));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_6, R.string.it_detail_achievement_6));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_7, R.string.it_detail_achievement_7));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_8, R.string.it_detail_achievement_8));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_9, R.string.it_detail_achievement_9));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_10, R.string.it_detail_achievement_10));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_11, R.string.it_detail_achievement_11));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_12, R.string.it_detail_achievement_12));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_13, R.string.it_detail_achievement_13));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_achievement_14, R.string.it_detail_achievement_14));
                    break;
                case 8:
                    //TODO : Add Grants table image here
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.it_consultancy_information, R.drawable.acm_banner, true));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_grants_information, R.string.it_detail_grants_information));
                    break;
                case 9:
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_ieee, R.string.it_detail_ieee, R.drawable.ieee_banner));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_csi, R.string.it_detail_csi, R.drawable.csi_banner));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_acm, R.string.it_detail_acm, R.drawable.acm_banner));
                    break;
                case 10:
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_hod, R.string.it_detail_hod));
                    break;
                case 11:
                    //TODO : Add Maps image view
                    details.add(new Detail(Detail.MAP_ADDRESS_TYPE, 0, R.string.it_address, R.drawable.acm_banner));
                    break;
                default:
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.about_us, R.string.it_about_dept));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.mission, R.string.it_mission_dept));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.vision, R.string.it_vision_dept));
            }
            mDetailList.add(details);
        }
    }

    public ArrayList<ArrayList<Detail>> getDeptList(String deptName) {
        return mDeptList.get(deptName);
    }
}
