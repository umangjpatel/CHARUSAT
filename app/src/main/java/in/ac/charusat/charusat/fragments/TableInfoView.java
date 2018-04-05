package in.ac.charusat.charusat.fragments;

import android.content.Context;

import com.levitnudi.legacytableview.LegacyTableView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

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

    private String[] mTitleArray, mContentArray;

    TableInfoView(Context context, Detail info) {
        mContext = context;
        mDetail = info;
    }

    @Resolve
    void onResolved() {
        switch (mDetail.getTableType()) {
            case Detail.BTECH_ADMIN:
                //set table title labels
                mTitleArray = new String[] {
                  "Year", "First Merit No.", "Last Merit No."
                };

                mContentArray = new String[] {
                        "2017-18","3388","5553",
                        "2016-17", "3381", "4633",
                        "2015-16","3954", "6953",
                        "2014-15", "5833", "10821"
                };
                break;
            case Detail.MTECH_ADMIN:
                mTitleArray = new String[] {
                        "Year", "First Merit No.", "Last Merit No."
                };

                mContentArray = new String[] {
                        "2017-18","3101107","3101424",
                        "2016-17", "3101403", "3101490",
                        "2015-16","3101634", "3101734",
                        "2014-15", "3101375", "3101485"
                };
                break;
            case Detail.IPR:
                mTitleArray = new String[] {
                        "Year", "Journal", "Conference"
                };

                mContentArray = new String[] {
                        "July 2016 to June 2017","7","14",
                        "July 2015 to June 2016", "5", "8",
                        "July 2014 to June 2015","7", "17",
                        "July 2013 to June 2014", "13", "7",
                        "July 2012 to June 2013", "3", "2",
                        "July 2011 to June 2012", "19", "0",
                        "July 2010 to June 2011", "7", "3",
                        "July 2009 to June 2010", "2", "9"
                };
                break;
            case Detail.CONSULTANCY:
                mTitleArray = new String[] {
                        "Institute / Agency", "Project", "Amount Received"
                };

                mContentArray = new String[] {
                        "CELTIC System Private Ltd.","Project Consultancy : I-Learn & I-Doc","Rs. 15 Lakhs",
                        "Meghdoot Steel Industries", "Project Consultancy", "Rs. 12,000/-",
                        "Grid Scape Solutions, UK","Charge Point Simulator SOAP API Design & Web Application", "Rs. 30,000/-",
                        "Nimisha International, USA", "Heat Transfer Analysis of Bus Duct & Analysis of AI Expansion Joint", "$ 5000/-",
                        "Nimisha International, USA", "Design & Analysis of Bus Duct with Software Development", "$ 5000/-",
                        "Department of Science and Technology (DST)", "Product Recommendation on Real Time Shopping mall data in the environment of IoT and Web Mining", "Rs. 40,82,600/-",
                        "MODROB-AICTE", "High Performance Computing", "Rs. 20,00,000/-",
                        "MODROB-AICTE", "Big Data Lab", "Rs. 18,00,000/-"
                };
                break;

            case Detail.RESOURCE_GENERATION:
                mTitleArray = new String[] {
                    "Organisation", "Faculty", "Amount Received (Rs.)", "For"
                };

                mContentArray = new String[] {
                    "NVIDIA Graphics Pvt. Ltd.", "Dr. Amit Thakkar", "1,75,000/-", "Nvidia GTX TitanXp & Nvidia Jetson Development Kit",
                    "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "2,80,000/-", "Infrastructure set up for A-View Classroom Project (Ongoing)",
                    "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "1,00,000/-", "Aakash-II Project (Completed)",
                    "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "184 Tablets", "Aakash-II Project (Tablets Received)"
                };
                break;
            case Detail.COLLAB_PROJECT:
                mTitleArray = new String[] {
                        "Faculty Coordinator",
                        "ID No.",
                        "Student Name",
                        "Project Title",
                        "Organisation / Dept. / Institute",
                        "External Coordinator"
                };

                mContentArray = new String[] {
                        "Dr. Amit Thakkar", "15PGIT002", "Kinal Ajudiya", "Decision Support System for Supply Chain Logistic using Geographical Information System", "ISRO", "Dr. C.P.Singh",
                        "Prof. Sonal Rami", "15PGIT001", "Himanshi Acharya", "Intelligent Control System for MR Damper using Bingham model", "PDPIAS (CHARUSAT)", "Dr. R.V.Upadhyay",
                        "Prof. Sonal Rami", "15PGIT008", "Neil Joshi", "Intelligent Control System for MR Damper using Bouc-Wen model", "PDPIAS (CHARUSAT)", "Dr. R.V.Upadhyay",
                        "Prof. Amit Nayak", "15PGIT015", "Divyang Solanki", "Inter-operable Client Server Comm Protocol with custom XSD Definition", "eInfochips Pvt. Ltd.", "Mr. Hitesh Ahuja",
                        "Prof. Hemant Yadav", "15PGIT009", "Sanjay Makwana", "Data Integrity in IoT (Green House Automation", "EC Department", "Prof. Jignesh Patoliya",
                        "Prof. Nirav Bhatt", "15PGIT014", "Sindur Patel", "Sensing Microblog for Effective Information Extraction", "LDRP", "Prof. S.J.Modha"                };
                break;

            case Detail.MOU:
                mTitleArray = new String[] {
                        "Company Name", "Date"
                };

                mContentArray = new String[] {
                        "Rhino Machines Pvt. Ltd., V.V.Nagar, Anand", "27th March, 2018",
                        "Systems Research Institute, Polish Academy of Sciences, Newelska 6, Warszawa, Poland", "20th March, 2018",
                        "Collabera Technologies Pvt. Ltd., Vadodara", "15th October, 2015",
                        "CELTIC Systems Pvt. Ltd., Vadodara","6th July, 2015",
                        "Federation of Gujarat Industries (FGI), Vadodara","July, 2014",
                        "Gujarat Electronics and Software Industries Association (GESIA), Ahmedabad","21st May, 2013",
                        "NME-ICT IIT Bombay","19th March, 2013",
                        "The Pennsylvania State University, USA","2nd November, 2009"
                };
                break;
        }
        LegacyTableView.insertLegacyTitle(mTitleArray);
        LegacyTableView.insertLegacyContent(mContentArray);
        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
        legacyTableView.setContent(LegacyTableView.readLegacyContent());
        legacyTableView.setTablePadding(9);
        legacyTableView.setTitleTextSize(32);
        legacyTableView.setContentTextSize(28);
        legacyTableView.build();

    }

}
