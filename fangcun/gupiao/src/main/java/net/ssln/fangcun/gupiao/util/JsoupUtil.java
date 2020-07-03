package net.ssln.fangcun.gupiao.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import net.ssln.fangcun.gupiao.domain.Jijin;
import net.ssln.fangcun.gupiao.domain.JijinBond;

public class JsoupUtil {
	public static List<Jijin> getJijin() throws IOException, ParseException{
		Document doc = Jsoup.connect("http://fund.ijijin.cn/data/Net/info/gpx_F009_desc_0_0_1_9999_0_0_0_jsonp_g.html").get();
		String jsonContext=doc.body().text().replaceAll("g(","").replaceAll(")","");
		 JSONObject jsonObject = JSONObject.parseObject(jsonContext);
		 jsonObject=jsonObject.getJSONObject("data").getJSONObject("data");
		 List<Jijin> list=new ArrayList<Jijin>();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        for (Map.Entry entry : jsonObject.entrySet()) {
	        	JSONObject item=JSONObject.parseObject(entry.getValue().toString());
	        	Jijin jijin=new Jijin();
	        	jijin.setId(StringUtil.getUUID());
	        	jijin.setCode(item.getString("code"));
	        	jijin.setName(item.getString("name"));
	        	
	        	String newdate=item.getString("newdate");
	        	if(newdate==null||newdate.isEmpty()){
	        		continue;
	        	}
	        	jijin.setNewdate(sdf.parse(newdate));
	        	Object f003N_FUND33=item.get("F003N_FUND33");
	        	
	        	if(f003N_FUND33==null||f003N_FUND33.toString().isEmpty()){
	        		continue;
	        	}
	        	try{
	        	jijin.setF003nFund33(item.getDouble("F003N_FUND33"));
	        	}catch(Exception e){
	        		System.out.println("");
	        	}
	        	Object f008=item.get("F008");
	        	jijin.setF008(f008==null?0:Double.parseDouble(f008.toString()));
	        	Object f009=item.get("F009");
	        	jijin.setF009(f009==null?0:Double.parseDouble(f009.toString()));
	        	Object f011=item.get("F011");
	        	jijin.setF011(f011==null?0:Double.parseDouble(f011.toString()));
	        	Object f012=item.get("F012");
	        	jijin.setF012(f012==null?0:Double.parseDouble(f012.toString()));
	        	Object rate=item.get("rate");
	        	jijin.setRate(rate==null?0:Double.parseDouble(rate.toString()));
	        	jijin.setType(item.getString("type"));
	        	list.add(jijin);
	        }

		return list;
	}
	public static List<JijinBond> getGupiaoByJijinCode(String code) throws IOException, ParseException{
		Document doc = Jsoup.connect("http://fund.10jqka.com.cn/web/fund/stockAndBond/"+code).get();
		//System.out.println(doc.text());
		 JSONObject jsonObject = JSONObject.parseObject(doc.text());
		 JSONArray jsonArray=jsonObject.getJSONObject("data").getJSONArray("stock");
		 List<JijinBond> list=new ArrayList<JijinBond>();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		 for(int i=0;i<jsonArray.size();i++){
			 JSONObject item=jsonArray.getJSONObject(i);
			 JijinBond jb=new JijinBond();
			 jb.setId(StringUtil.getUUID());
			 jb.setCode(code);
			 jb.setZccode(item.getString("zcCode"));
			 jb.setZcname(item.getString("zcName"));
			 jb.setZctype(item.getString("zcType"));
			 jb.setCcrate(item.getDouble("ccRate"));
			 
			 jb.setEnddate(sdf.parse(item.getString("enddate")));
			 jb.setHold(item.getDouble("hold"));
			 jb.setOldzccode(item.getString("oldzcCode"));
			 jb.setTotalprice(item.getDouble("totalPrice"));
			list.add(jb);
		 }
		return list;
	}
	public static void main(String[] args){
		try {
			JsoupUtil.getGupiaoByJijinCode("515880");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
