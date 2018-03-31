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
                mContentArray.add("31010490");
                mContentArray.add("2015-16");
                mContentArray.add("31010634");
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
                mContentArray.add("CELTIC System Private Ltd.");
                mContentArray.add("Charge Point Simulator SOAP API Design & Web Application");
                mContentArray.add("Rs. 30,000/-");
                mContentArray.add("Nimisha International, USA");
                mContentArray.add("Heat Transfer Analysis of Bus Duct & Analysis of AI Expansion Joint");
                mContentArray.add("$ 5000");
                mContentArray.add("Nimisha International, USA");
                mContentArray.add("Design & Analysis of Bus Duct with Software Development");
                mContentArray.add("$ 5000");
                break;

            case Detail.TOP_PLACEMENT:

                break;
        }
        LegacyTableView.insertLegacyTitle(mTitleArray.toArray(new String[mTitleArray.size()]));
        //set table contents as string arrays
        LegacyTableView.insertLegacyContent(mContentArray.toArray(new String[mContentArray.size()]));
        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
        legacyTableView.setContent(LegacyTableView.readLegacyContent());
        legacyTableView.setTablePadding(7);
        legacyTableView.setTitleTextSize(32);
        legacyTableView.setContentTextSize(28);
        legacyTableView.setContentTextAlignment(android.view.View.TEXT_ALIGNMENT_CENTER);
        legacyTableView.build();

    }

}
