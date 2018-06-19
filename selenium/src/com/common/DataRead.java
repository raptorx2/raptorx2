package com.common;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;


class DataRead {


	 public static String[] csvRead(String filepath) {
		
		String line = null;
		List list = new List();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			while((line = br.readLine())!= null){
				//System.out.println(line);
				list.add(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		 
		 return null;
	}

	 public static void main(String[] args) {
		 DataRead dr = new DataRead();
		 dr.csvRead("C:\\Users\\EVIUPAY\\Desktop\\new 15.txt");
	 }
	 
}
