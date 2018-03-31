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
                    details.add(new Detail(Detail.ONLY_TABLE_TYPE, R.string.it_btech_admission_stats, Detail.BTECH_ADMIN));
                    details.add(new Detail(Detail.ONLY_TABLE_TYPE, R.string.it_mtech_admission_stats, Detail.MTECH_ADMIN));
                    break;
                case 2:
                    details.add(new Detail(Detail.IMAGE_TABLE_TYPE, R.string.placement_heading_label, R.drawable.placementgraph, Detail.TOP_PLACEMENT));
                    details.add(new Detail(Detail.ONLY_IMAGE_TYPE, R.string.higher_studies_heading_label, R.drawable.higherstudies, true));
                    break;
                case 3:
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_sophos, R.string.it_resource_sophos, R.drawable.sophoslab));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_vr, R.string.it_resource_vr, R.drawable.vrlab));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_pearson, R.string.it_resource_pearson, R.drawable.pearsonlab));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_labs, R.string.it_resource_labs, R.drawable.maclab));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_mm_hall, R.string.it_resource_mm_hall, R.drawable.multimedia));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_internet_lab, R.string.it_resource_internet_lab, R.drawable.resource_4));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_server_room, R.string.it_resource_server_room, R.drawable.resource_5));
                    break;
                case 4:
                    details.add(new Detail(Detail.DIRECT_TEXT_TYPE, 0, R.string.it_collaborations));
                    break;
                case 5:
                    details.add(new Detail(Detail.ONLY_TABLE_TYPE, R.string.it_publications, Detail.IPR));
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
                    details.add(new Detail(Detail.ONLY_TABLE_TYPE, R.string.it_consultancy_information, Detail.CONSULTANCY));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_grants_information, R.string.it_detail_grants_information));
                    break;
                case 9:
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_ieee, R.string.it_detail_ieee, R.drawable.ieee_banner));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_csi, R.string.it_detail_csi, R.drawable.csi_banner));
                    details.add(new Detail(Detail.IMAGE_TEXT_TYPE, R.string.it_acm, R.string.it_detail_acm, R.drawable.acm_banner));
                    break;
                case 10:
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_hod, R.string.it_detail_hod));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_amit_thakkar, R.string.it_detail_amit_thakkar));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_bimal_patel, R.string.it_detail_bimal_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_purvi_prajapati, R.string.it_detail_purvi_prajapati));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_amit_nayak, R.string.it_detail_amit_nayak));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_nirav_bhatt, R.string.it_detail_nirav_bhatt));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_hardik_jaiswal, R.string.it_detail_hardik_jaiswal));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_hemant_yadav, R.string.it_detail_hemant_yadav));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_jaimin_chavda, R.string.it_detail_jaimin_chavda));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_ayesha_shaikh, R.string.it_detail_ayesha_shaikh));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_mrudang_pandya, R.string.it_detail_mrudang_pandya));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_jalpesh_vasa, R.string.it_detail_jalpesh_vasa));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_pinal_shah, R.string.it_detail_pinal_shah));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_ravi_patel, R.string.it_detail_ravi_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_priyanka_patel, R.string.it_detail_priyanka_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_sanket_suthar, R.string.it_detail_sanket_suthar));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_pritesh_prajapati, R.string.it_detail_pritesh_prajapati));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_nehal_patel, R.string.it_detail_nehal_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_kamlesh_makwana, R.string.it_detail_kamlesh_makwana));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_chandni_shah, R.string.it_detail_chandni_shah));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_sagar_patel, R.string.it_detail_sagar_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_sonal_rami, R.string.it_detail_sonal_rami));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_henish_shah, R.string.it_detail_henish_shah));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_amit_parmar, R.string.it_detail_amit_parmar));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_harsh_patel, R.string.it_detail_harsh_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_sandip_patel, R.string.it_detail_sandip_patel));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_vishwa_vala, R.string.it_detail_vishwa_vala));
                    details.add(new Detail(Detail.ONLY_TEXT_TYPE, R.string.it_jay_patel, R.string.it_detail_jay_patel));

                    break;
                case 11:
                    details.add(new Detail(Detail.MAP_ADDRESS_TYPE, 0, R.string.it_address, R.drawable.caharusat_map));
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
