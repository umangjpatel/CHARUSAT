package in.ac.charusat.charusat.models;

import java.util.ArrayList;
import java.util.HashMap;

public class TableListLab {
    private static TableListLab sTableListLab;

    private HashMap<String, ArrayList<String[]>> mTableInfoList;

    public static TableListLab getInstance() {
        if (sTableListLab == null)
            sTableListLab = new TableListLab();
        return sTableListLab;
    }

    private TableListLab() {
        addTableData();
    }

    private void addTableData() {
        mTableInfoList = new HashMap<>();
        addBTechAdmissionData();
        addMTechAdmissionData();
        addIprData();
        addConsultancyData();
        addCollaborativeProjects();
        addMouData();
        addResourceData();

    }

    private void addBTechAdmissionData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Year", "First Merit No.", "Last Merit No."
        });
        list.add(new String[]{
                "2017-18", "3388", "5553",
                "2016-17", "3381", "4633",
                "2015-16", "3954", "6953",
                "2014-15", "5833", "10821"
        });
        mTableInfoList.put(Detail.BTECH_ADMIN, list);
    }

    private void addMTechAdmissionData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Year", "First Merit No.", "Last Merit No."
        });
        list.add(new String[]{
                "2017-18", "3101107", "3101424",
                "2016-17", "3101403", "3101490",
                "2015-16", "3101634", "3101734",
                "2014-15", "3101375", "3101485"
        });
        mTableInfoList.put(Detail.MTECH_ADMIN, list);

    }

    private void addIprData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Year", "Journal", "Conference"
        });
        list.add(new String[]{
                "July 2016 to June 2017", "7", "14",
                "July 2015 to June 2016", "5", "8",
                "July 2014 to June 2015", "7", "17",
                "July 2013 to June 2014", "13", "7",
                "July 2012 to June 2013", "3", "2",
                "July 2011 to June 2012", "19", "0",
                "July 2010 to June 2011", "7", "3",
                "July 2009 to June 2010", "2", "9"
        });
        mTableInfoList.put(Detail.IPR, list);
    }

    private void addConsultancyData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Institute / Agency", "Project", "Amount Received"
        });
        list.add(new String[]{
                "CELTIC System Private Ltd.", "Project Consultancy : I-Learn & I-Doc", "Rs. 15 Lakhs",
                "Meghdoot Steel Industries", "Project Consultancy", "Rs. 12,000/-",
                "Grid Scape Solutions, UK", "Charge Point Simulator SOAP API Design & Web Application", "Rs. 30,000/-",
                "Nimisha International, USA", "Heat Transfer Analysis of Bus Duct & Analysis of AI Expansion Joint", "$ 5000/-",
                "Nimisha International, USA", "Design & Analysis of Bus Duct with Software Development", "$ 5000/-",
                "Department of Science and Technology (DST)", "Product Recommendation on Real Time Shopping mall data in the environment of IoT and Web Mining", "Rs. 40,82,600/-",
                "MODROB-AICTE", "High Performance Computing", "Rs. 20,00,000/-",
                "MODROB-AICTE", "Big Data Lab", "Rs. 18,00,000/-"
        });
        mTableInfoList.put(Detail.CONSULTANCY, list);
    }

    private void addResourceData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Organisation", "Faculty", "Amount Received (Rs.)", "For"
        });
        list.add(new String[]{
                "NVIDIA Graphics Pvt. Ltd.", "Dr. Amit Thakkar", "1,75,000/-", "Nvidia GTX TitanXp & Nvidia Jetson Development Kit",
                "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "2,80,000/-", "Infrastructure set up for A-View Classroom Project (Ongoing)",
                "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "1,00,000/-", "Aakash-II Project (Completed)",
                "MHRD, Govt. of India under NMEICT scheme, IIT, Bombay", "Prof. Ayesha Shaikh", "184 Tablets", "Aakash-II Project (Tablets Received)"
        });
        mTableInfoList.put(Detail.RESOURCE_GENERATION, list);
    }

    private void addCollaborativeProjects() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Faculty Coordinator",
                "ID No.",
                "Student Name",
                "Project Title",
                "Organisation / Dept. / Institute",
                "External Coordinator"
        });
        list.add(new String[]{
                "Dr. Amit Thakkar", "15PGIT002", "Kinal Ajudiya", "Decision Support System for Supply Chain Logistic using Geographical Information System", "ISRO", "Dr. C.P.Singh",
                "Prof. Sonal Rami", "15PGIT001", "Himanshi Acharya", "Intelligent Control System for MR Damper using Bingham model", "PDPIAS (CHARUSAT)", "Dr. R.V.Upadhyay",
                "Prof. Sonal Rami", "15PGIT008", "Neil Joshi", "Intelligent Control System for MR Damper using Bouc-Wen model", "PDPIAS (CHARUSAT)", "Dr. R.V.Upadhyay",
                "Prof. Amit Nayak", "15PGIT015", "Divyang Solanki", "Inter-operable Client Server Comm Protocol with custom XSD Definition", "eInfochips Pvt. Ltd.", "Mr. Hitesh Ahuja",
                "Prof. Hemant Yadav", "15PGIT009", "Sanjay Makwana", "Data Integrity in IoT (Green House Automation", "EC Department", "Prof. Jignesh Patoliya",
                "Prof. Nirav Bhatt", "15PGIT014", "Sindur Patel", "Sensing Microblog for Effective Information Extraction", "LDRP", "Prof. S.J.Modha"
        });
        mTableInfoList.put(Detail.COLLAB_PROJECT, list);

    }

    private void addMouData() {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{
                "Company Name", "Date"
        });
        list.add(new String[]{
                "Rhino Machines Pvt. Ltd., V.V.Nagar, Anand", "27th March, 2018",
                "Systems Research Institute, Polish Academy of Sciences, Newelska 6, Warszawa, Poland", "20th March, 2018",
                "Collabera Technologies Pvt. Ltd., Vadodara", "15th October, 2015",
                "CELTIC Systems Pvt. Ltd., Vadodara", "6th July, 2015",
                "Federation of Gujarat Industries (FGI), Vadodara", "July, 2014",
                "Gujarat Electronics and Software Industries Association (GESIA), Ahmedabad", "21st May, 2013",
                "NME-ICT IIT Bombay", "19th March, 2013",
                "The Pennsylvania State University, USA", "2nd November, 2009"
        });
        mTableInfoList.put(Detail.MOU, list);

    }

    public ArrayList<String[]> getTableInfoList(String tableType) {
        return mTableInfoList.get(tableType);
    }
}