package net.ssln.fangcun.collection.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupUtil {
	public static List<Map<String,String>> getListLink(String url){
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		Map<String,String> map;
		try {
			Document doc = Jsoup.connect(url).get();
			
			Elements elements=doc.select(".zm-select-mx>li>a");
	    for(Element e:elements){
	    	map=new HashMap<String,String>();
		System.out.println(e.attr("abs:href")+"-----"+e.text());
		map.put("url", e.attr("abs:href"));
		map.put("name", e.text());
		list.add(map);
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static Map<String,String> getdetail(Map<String,Object> opetion){
		String url=opetion.get("url").toString(); //�ɼ�ҳ��ַ
		try {
			Document doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args){
		try {
			Document doc = Jsoup.connect("http://www.365j.com/star/list--1--1.html").get();
			Elements elements=doc.select(".zm-select-mx>li>a");
	for(Element e:elements){
		System.out.println(e.attr("abs:href")+"-----"+e.text());
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
