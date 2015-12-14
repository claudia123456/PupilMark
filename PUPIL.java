public class PUPIL
{
    // list of properties
    private String fName;
    private String sName;
    private int PupilMark;
    private int topmark;
    private int maxDataPosition;

    public PUPIL ()
    {
        //constructor

        fName = "";
        sName = "";
        PupilMark = 0;
        maxDataPosition = 0;

    }      
    //file handling store details from fie
    public void readPupilDetails (String dataItems)
    {//unpack string of row data into fields
        String [] rowItems = dataItems.split(",");
        // store each data items as instance property
        fName = rowItems [0];
        sName = rowItems [1];
        PupilMark = Integer.parseInt(rowItems[2]);
    }  

    public String writeDetails ()
    {
        // Join up data into a string to output as a row
        //use "," to seperate csv colums
        String pupilData = "";
        pupilData= pupilData.concat(fName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(sName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(PupilMark));
        return pupilData;
    }

    public int getPupilMark ()
    {
        return PupilMark;
    }   

    public void displayDetails ()
    {

        System.out.print("Pupil: " + fName + " " + sName);
        System.out.print(",  PupilMark is " + PupilMark);
        System.out.println();

    }
}

        