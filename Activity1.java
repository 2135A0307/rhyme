import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class Activity1
{
    public static void main(String[] args)
    {
        //new folder
        try
        {
           String folderName = "C:/AdityaCollegeOFEngg";
           File newFolderObject = new File(folderName);
           if(newFolderObject.exists())
           {
            System.out.println("Folder is existing");
           }
           else
            {
                if(newFolderObject.mkdir())
                {
                    System.out.println("Folder is Created");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Run time error");
        }

        // new file
        try
        {
            String newfileName = "C:/AdityaCollegeOFEngg/demoDatabase.txt";
            File newFileObject = new File(newfileName);
            if(newFileObject.exists())
            {
                System.out.println("File is existing");
            }
            else
            {
                if(newFileObject.createNewFile())
                {
                    System.out.println("File is Created");
                }
            }
        
        }
        catch(Exception e)
        {
            System.out.println("Run time error");
        }

        try
        {

            String FileName = "C:/AdityaCollegeOFEngg/demoDatabase.txt";
            File objFile = new File(FileName);

            String inputText = "a.	101,Aman V,CO\nb.	102,Parth Sarthi,EE\nc.	103,Saritha V,CO\nd.	104,Devika T,EE";
            byte[] byteInputText = inputText.getBytes();

            FileOutputStream fileWritingOutput = new FileOutputStream(objFile);
            fileWritingOutput.write(byteInputText); 
            System.out.println("Writing into file is completed");      
            
            fileWritingOutput.close();
            
        } 
        catch (Exception e)
        {
            System.out.println("Error");
        }
        
        try
        {
            File fileObject = new File("C:/AdityaCollegeOFEngg/demoDatabase.txt");    
            FileInputStream fileReadingObject = new FileInputStream(fileObject);
            int inputFromFile;
            while((inputFromFile=fileReadingObject.read())!=-1)
                {
                    System.out.print((char)inputFromFile);
                }
                System.out.println("\nReading from the file is completed");
            fileReadingObject.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        //Delete the file
        String fileNameDel = "C:/AdityaCollegeOFEngg/demoDatabase.txt"; 
        File fileObjectDel = new File(fileNameDel);
        if(fileObjectDel.delete())
        {
            System.out.println(" deleted Successfully");
        }
        else
        {
            System.out.println("Error");
        }
    }

}