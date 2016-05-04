package com.jtrent238.foodmod;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;


public class VersionChecker implements Runnable
{
    private static boolean isLatestVersion = false;
    private static String latestVersion = "1.0.0.6";

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() 
    {
        InputStream in = null;
        try 
        {
            in = new URL("https://raw.githubusercontent.com/jtrent238/jtrent238FoodMod/master/version_file").openStream();
        } 
        catch 
        (MalformedURLException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        try 
        {
            latestVersion = IOUtils.readLines(in).get(0);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            IOUtils.closeQuietly(in);
        }
        System.out.println("Latest mod version = "+latestVersion);
        isLatestVersion = FoodMod.MODVERSION.equals(latestVersion);
        System.out.println("Are you running latest version = "+isLatestVersion);
    }
    
    public boolean isLatestVersion()
    {
     return isLatestVersion;
    }
    
    public String getLatestVersion()
    {
     return latestVersion;
    }
}