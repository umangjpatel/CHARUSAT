package in.ac.charusat.charusat.fragments;

import android.content.Context;

import com.levitnudi.legacytableview.LegacyTableView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.models.Detail;

@Layout(R.layout.only_table_feed_item)
class TableInfoView {

    @ParentPosition
    int mParentPosition;

    @ChildPosition
    int mChildPosition;

    @View(R.id.table_view)
    LegacyTableView legacyTableView;

    private Detail mDetail;
    private Context mContext;

    private ArrayList<String> mTitleArray, mContentArray;

    TableInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
        mTitleArray = new ArrayList<>();
        mContentArray = new ArrayList<>();
    }

    @Resolve
    void onResolved() {
        switch (mDetail.getTableType()) {
            case Detail.BTECH_ADMIN:
                //set table title labels
                mTitleArray.clear();
                mTitleArray.add("Year");
                mTitleArray.add("First Merit No.");
                mTitleArray.add("Last Merit No.");

                mContentArray.clear();
                mContentArray.add("2017-18");
                mContentArray.add("3388");
                mContentArray.add("5553");
                mContentArray.add("2016-17");
                mContentArray.add("3381");
                mContentArray.add("4633");
                mContentArray.add("2015-16");
                mContentArray.add("3954");
                mContentArray.add("6953");
                mContentArray.add("2014-15");
                mContentArray.add("5833");
                mContentArray.add("10821");
                break;
            case Detail.MTECH_ADMIN:
                mTitleArray.clear();
                mTitleArray.add("Year");
                mTitleArray.add("First Merit No.");
                mTitleArray.add("Last Merit No.");

                mContentArray.clear();
                mContentArray.add("2017-18");
                mContentArray.add("3101107");
                mContentArray.add("3101424");
                mContentArray.add("2016-17");
                mContentArray.add("3101403");
                mContentArray.add("3101490");
                mContentArray.add("2015-16");
                mContentArray.add("3101634");
                mContentArray.add("3101734");
                mContentArray.add("2014-15");
                mContentArray.add("3101375");
                mContentArray.add("3101485");
                break;
            case Detail.IPR:
                mTitleArray.clear();
                mTitleArray.add("Year");
                mTitleArray.add("Journal");
                mTitleArray.add("Conference");

                mContentArray.clear();
                mContentArray.add("July 2016 to June 2017");
                mContentArray.add("7");
                mContentArray.add("14");
                mContentArray.add("July 2015 to June 2016");
                mContentArray.add("5");
                mContentArray.add("8");
                mContentArray.add("July 2014 to June 2015");
                mContentArray.add("7");
                mContentArray.add("17");
                mContentArray.add("July 2013 to June 2014");
                mContentArray.add("13");
                mContentArray.add("7");
                mContentArray.add("July 2012 to June 2013");
                mContentArray.add("3");
                mContentArray.add("2");
                mContentArray.add("July 2011 to June 2012");
                mContentArray.add("19");
                mContentArray.add("0");
                mContentArray.add("July 2010 to June 2011");
                mContentArray.add("7");
                mContentArray.add("3");
                mContentArray.add("July 2009 to June 2010");
                mContentArray.add("2");
                mContentArray.add("9");
                break;
            case Detail.CONSULTANCY:
                mTitleArray.add("Institute / Agency");
                mTitleArray.add("Project");
                mTitleArray.add("Amount Received");

                mContentArray.add("CELTIC System Private Ltd.");
                mContentArray.add("Project Consultancy : I-Learn & I-Doc");
                mContentArray.add("Rs. 15 Lakhs");

                mContentArray.add("Meghdoot Steel Industries");
                mContentArray.add("Project Consultancy");
                mContentArray.add("Rs. 12,000/-");

                mContentArray.add("Grid Scape Solutions, UK");
                mContentArray.add("Charge Point Simulator SOAP API Design & Web Application");
                mContentArray.add("Rs. 30,000/-");

                mContentArray.add("Nimisha International, USA");
                mContentArray.add("Heat Transfer Analysis of Bus Duct & Analysis of AI Expansion Joint");
                mContentArray.add("$ 5000/-");

                mContentArray.add("Nimisha International, USA");
                mContentArray.add("Design & Analysis of Bus Duct with Software Development");
                mContentArray.add("$ 5000/-");

                mContentArray.add("Department of Science and Technology (DST)");
                mContentArray.add("Product Recommendation on Real Time Shopping mall data in the environment of IoT and Web Mining");
                mContentArray.add("Rs. 40,82,600/-");

                mContentArray.add("MODROB-AICTE");
                mContentArray.add("High Performance Computing");
                mContentArray.add("Rs. 20,00,000/-");

                mContentArray.add("MODROB-AICTE");
                mContentArray.add("Big Data Lab");
                mContentArray.add("Rs. 18,00,000/-");

                break;

            case Detail.RESOURCE_GENERATION:
                mTitleArray.clear();
                mTitleArray.add("Organisation");
                mTitleArray.add("Faculty");
                mTitleArray.add("Amount Received (Rs.)");
                mTitleArray.add("For");

                mContentArray.clear();
                mContentArray.add("NVIDIA Graphics Pvt. Ltd.");
                mContentArray.add("Dr. Amit Thakkar");
                mContentArray.add("1,75,000/-");
                mContentArray.add("Nvidia GTX TitanXp & Nvidia Jetson Development Kit");

                mContentArray.add("MHRD, Govt. of India under NMEICT scheme, IIT, Bombay");
                mContentArray.add("Prof. Ayesha Shaikh");
                mContentArray.add("2,80,000/-");
                mContentArray.add("Infrastructure set up for A-View Classroom Project (Ongoing)");

                mContentArray.add("MHRD, Govt. of India under NMEICT scheme, IIT, Bombay");
                mContentArray.add("Prof. Ayesha Shaikh");
                mContentArray.add("1,00,000/-");
                mContentArray.add("Aakash-II Project (Completed)");

                mContentArray.add("MHRD, Govt. of India under NMEICT scheme, IIT, Bombay");
                mContentArray.add("Prof. Ayesha Shaikh");
                mContentArray.add("184 Tablets");
                mContentArray.add("Aakash-II Project (Tablets Received)");
                break;
            case Detail.COLLAB_PROJECT:
                mTitleArray.clear();
                mTitleArray.add("Faculty Coordinator");
                mTitleArray.add("ID No.");
                mTitleArray.add("Student Name");
                mTitleArray.add("Project Title");
                mTitleArray.add("Organisation / Dept. / Institute");
                mTitleArray.add("External Coordinator");

                mContentArray.clear();
                mContentArray.add("Dr. Amit Thakkar");
                mContentArray.add("15PGIT002");
                mContentArray.add("Kinal Ajudiya");
                mContentArray.add("Decision Support System for Supply Chain Logistic using Geographical Information System");
                mContentArray.add("ISRO");
                mContentArray.add("Dr. C.P.Singh");

                mContentArray.add("Prof. Sonal Rami");
                mContentArray.add("15PGIT001");
                mContentArray.add("Himanshi Acharya");
                mContentArray.add("Intelligent Control System for MR Damper using Bingham model");
                mContentArray.add("PDPIAS (CHARUSAT)");
                mContentArray.add("Dr. R.V.Upadhyay");

                mContentArray.add("Prof. Sonal Rami");
                mContentArray.add("15PGIT008");
                mContentArray.add("Neil Joshi");
                mContentArray.add("Intelligent Control System for MR Damper using Bouc-Wen model");
                mContentArray.add("PDPIAS (CHARUSAT)");
                mContentArray.add("Dr. R.V.Upadhyay");

                mContentArray.add("Prof. Amit Nayak");
                mContentArray.add("15PGIT015");
                mContentArray.add("Divyang Solanki");
                mContentArray.add("Inter-operable Client Server Comm Protocol with custom XSD Definition");
                mContentArray.add("eInfochips Pvt. Ltd.");
                mContentArray.add("Mr. Hitesh Ahuja");

                mContentArray.add("Prof. Hemant Yadav");
                mContentArray.add("15PGIT009");
                mContentArray.add("Sanjay Makwana");
                mContentArray.add("Data Integrity in IoT (Green House Automation");
                mContentArray.add("EC Department");
                mContentArray.add("Prof. Jignesh Patoliya");

                mContentArray.add("Prof. Nirav Bhatt");
                mContentArray.add("15PGIT014");
                mContentArray.add("Sindur Patel");
                mContentArray.add("Sensing Microblog for Effective Information Extraction");
                mContentArray.add("LDRP");
                mContentArray.add("Prof. S.J.Modha");
                break;
            case Detail.MOU:
                mTitleArray.clear();
                mTitleArray.add("Company Name");
                mTitleArray.add("Date");

                mContentArray.clear();
                mContentArray.add("Rhino Machines Pvt. Ltd., V.V.Nagar, Anand");
                mContentArray.add("27th March, 2018");

                mContentArray.add("Systems Research Institute, Polish Academy of Sciences, Newelska 6, Warszawa, Poland");
                mContentArray.add("20th March, 2018");

                mContentArray.add("Collabera Technologies Pvt. Ltd., Vadodara");
                mContentArray.add("15th October, 2015");

                mContentArray.add("CELTIC Systems Pvt. Ltd., Vadodara");
                mContentArray.add("6th July, 2015 to 5th July, 2017");

                mContentArray.add("Federation of Gujarat Industries (FGI), Vadodara");
                mContentArray.add("July, 2014");

                mContentArray.add("Gujarat Electronics and Software Industries Association (GESIA), Ahmedabad");
                mContentArray.add("21st May, 2013");

                mContentArray.add("NME-ICT IIT Bombay");
                mContentArray.add("19th March, 2013");

                mContentArray.add("The Pennsylvania State University, USA");
                mContentArray.add("2nd November, 2009");
                break;
        }
        LegacyTableView.insertLegacyTitle(mTitleArray.toArray(new String[mTitleArray.size()]));
        //set table contents as string arrays
        LegacyTableView.insertLegacyContent(mContentArray.toArray(new String[mContentArray.size()]));
        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
        legacyTableView.setContent(LegacyTableView.readLegacyContent());
        legacyTableView.setTablePadding(9);
        legacyTableView.setTitleTextSize(32);
        legacyTableView.setContentTextSize(28);
        legacyTableView.build();

    }

}
