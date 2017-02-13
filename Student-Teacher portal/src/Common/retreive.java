/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.io.*;

/**
 *
 * @author Abhay Goyal
 */
public class retreive {
    
    static File[] listOfFiles;
    public File[] getFile() //return the files that we need
    {
        return listOfFiles;
    }

    public void setFile()
    {
        int i;
        String f="C:\\Users\\Abhay Goyal\\Documents\\NetBeansProjects\\Qs\\CSE";
        File folder=new File(f);
        listOfFiles=folder.listFiles();
        for(i = 0; i < listOfFiles.length; i++) 
        {
        if (listOfFiles[i].isFile())
        {
            System.out.println("File " + listOfFiles[i].getName());
        }
        else if (listOfFiles[i].isDirectory()) 
        {
            System.out.println("Directory " + listOfFiles[i].getName());
        }
        }
    }
    public static void main(String args[])
    {
        retreive r=new retreive();
        r.setFile();
        r.getFile();
        
    } 
}
