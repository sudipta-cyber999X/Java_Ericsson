package File_Handling;

import java.io.File;

public class fileOne {
    //Create Folder
    public static void createFolder (String folderpath) {
        File folder = new File(folderpath);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder Created:"+folderpath);
        }
    }

    //Check-Folder if exists:
    public static boolean checkFolder (String folderpath) {
        File folder = new File(folderpath);
        return folder.exists();
    }
    
    public static void main(String[] args) {
        
        String folderpath="C:\\Users\\edebsud\\OneDrive - Ericsson\\Desktop";
        createFolder(folderpath);
    }
}
