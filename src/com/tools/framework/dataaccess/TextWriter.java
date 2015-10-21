package com.tools.framework.dataaccess;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

import com.tools.framework.GlobalConstants;



public class TextWriter {
	

		
	  

	public static void writer(String info)  {
		
		try {
			String TestFile = GlobalConstants.MESSAGE_FILE;
			//File FC = new File(TestFile);//Created object of java File class.
			//FC.createNewFile();//Create file.
            
	
			
			FileWriter FW;

			FW = new FileWriter(TestFile, true);
		
			BufferedWriter BW = new BufferedWriter(FW);
			
				BW.write(info);
				BW.newLine();
				
			
			
			
		
				BW.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		}

		// Reading from file.
		// Create Object of java FileReader and BufferedReader class.
		// FileReader FR = new FileReader(TestFile);
		// BufferedReader BR = new BufferedReader(FR);
		// String Content = "";

		// Loop to read all lines one by one from file and print It.
		// while((Content = BR.readLine())!= null){
		// System.out.println(Content);
	}

