import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[];
    // number of pupils to be called 
    int noOfPupils;
    FILEREADCSV PupilMark;

    public SCHOOL()
    {
        PupilMark = new FILEREADCSV();

    }

    // top level algorithm
    public void processPupils() throws IOException
    {
        setupPupilList();
        countPupilMark();

    }

    private void setupPupilList() throws IOException
    { // placeholder 
        System.out.println("School : PupilMark update");
        System.out.println("** Preparing to read data file.");
        String [] dataRows = PupilMark.readCSVtable ();
        noOfPupils = dataRows.length -1;
        System.out.println("** " + noOfPupils + "rows read .\n\n");
        pupilList = new PUPIL [noOfPupils];

        for (int i = 0; i < noOfPupils; i++) {
            pupilList[i] = new PUPIL ();
            pupilList[i].readPupilDetails(dataRows[i+1]);
        }
    }

    public void countPupilMark() throws IOException
    {
        //placeholder
        for (int i = 0; i < noOfPupils; i++)
        {
            if ((PupilList[i].getPupilMark() < PupilList [maxDataPosition].getdata )) {
                MaxDataPosition = 1;
            }
        }
           
            System.out.print("Position is:" + maxDataPosition +" , Value is:");
            dataList[maxDataPosition].displayData();
            System.out.println();
        }
        
        }