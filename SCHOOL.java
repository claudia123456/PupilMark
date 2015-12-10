import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[];
    private int maxDataPosition;
    // number of pupils to be called 
    int noOfPupils;
    FILEREADCSV PupilMark;
    FILEWRITECSV resultFile;
    private int topmark;

    public SCHOOL()
    {
        PupilMark = new FILEREADCSV();
        resultFile = new FILEWRITECSV();

    }
    // top level algorithm
    public void processPupils() throws IOException
    { 
        setupPupilList();
        findmaxData ();

    }

    private void setupPupilList() throws IOException
    { // placeholder 
        System.out.println("School : PupilMark update");
        System.out.println("** Preparing to read data file.");
        String [] dataRows = PupilMark.readCSVtable ();
        noOfPupils = dataRows.length ;
        System.out.println("** " + noOfPupils + "rows read .\n\n");
        pupilList = new PUPIL [noOfPupils];

        for (int i = 0; i < noOfPupils; i++) {
            pupilList[i] = new PUPIL ();
            pupilList[i].readPupilDetails(dataRows[i]);
        }
    }

    public void findmaxData ()    throws IOException 
    {
        //placeholder
        int maxDataPosition = 0;
        String FileContent = "";

        for (int i = 1; i < noOfPupils; i++)
        {
            if (pupilList [i].getPupilMark() < pupilList [maxDataPosition].getPupilMark ()) {
                maxDataPosition = i;
            }
            if (maxDataPosition>1)
            {
                FileContent = FileContent.concat("\n");

            }
        }    
          FileContent = FileContent.concat(pupilList[maxDataPosition].writeDetails());

            System.out.print("topmark is:" + maxDataPosition);
            pupilList[maxDataPosition].displayDetails();
            System.out.println();

            System.out.println ("** preparingto write data file. ");
            resultFile.writeCSVtable(FileContent);
            System.out.println(" File written and closed");
    }
    
}
