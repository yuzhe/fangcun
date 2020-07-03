package net.ssln.fangcun.gupiao.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class test {
	public static String ReadFile(String Path){
		BufferedReader reader = null;
		String laststr = "";
		try{
			FileInputStream fileInputStream = new FileInputStream(Path);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while((tempString = reader.readLine()) != null){
				laststr += tempString;
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return laststr;
	}

	public static void main(String[] args) {
//		String JsonContext = ReadFile("E:\\data.json");
//		 JSONObject jsonObject = JSONObject.parseObject(JsonContext);
//		 jsonObject=jsonObject.getJSONObject("data").getJSONObject("data");
//	        for (Map.Entry entry : jsonObject.entrySet()) {
//	           System.out.println(entry.getKey()+"|"+entry.getValue());
//	        }
		List<String> array=new ArrayList<String>();
		long time1=System.currentTimeMillis();	
		try{
		for(int i=0;i<100000000;i++){
			array.add("asdasdsadsadasdasdsadasdsadasdasdasdasd");
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		long time2=System.currentTimeMillis();
		System.out.println("当前程序耗时："+(time2-time1)+"ms");
		
		long time3=System.currentTimeMillis();

		System.out.println("当前程序耗时："+(time3-time2)+"ms");
	

	}

}
