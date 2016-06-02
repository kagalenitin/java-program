package com.learn.files;

import java.io.File;
import java.io.IOException;

/**
 * Created by nkagale on 4/25/16.
 */
public class FileInDirectory {
    public static void main(String arg[]) {
        // Use relative path for Unix systems
        File f = new File("./data/test.txt");
        f.getParentFile().mkdir();
        try{
            if(!f.exists()){
                f.createNewFile();
                if(f.exists()){
                    System.out.println("File created");
                }else{
                    System.out.println("File was not created");
                }
            }else{
                System.out.println("Folder and file already exists");
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
