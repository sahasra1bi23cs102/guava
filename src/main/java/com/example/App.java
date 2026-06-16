package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits=ImmutableList.of("Apple","Banana","Cherry");
        System.out.println("Fruits" + fruits);
        File sourceFile=new File("source.txt");
        File destFile=new File("dest.txt");
        
        try{
          FileUtils.copyFile(sourceFile,destFile);
          System.out.println("File Copied");
          }catch(IOException e) {
            System.err.println(
                  "Error occured while copying" + e.getMessage());
                }
      }
          
}
