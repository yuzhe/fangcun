package net.ssln.fangcun.gupiao.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.ssln.fangcun.gupiao.domain.Jijin;
import net.ssln.fangcun.gupiao.domain.JijinBond;
import net.ssln.fangcun.gupiao.service.JijinBondService;
import net.ssln.fangcun.gupiao.service.JijinService;
import net.ssln.fangcun.gupiao.util.JsoupUtil;

@Controller  
public class MainController {
	@Resource
	private JijinService jijinService;
	@Resource
	private JijinBondService jijinBondService;
	@RequestMapping(value="/")  
    @ResponseBody  
    String test() throws ParseException{  
	   
//		String JsonContext = ReadFile("E:\\data.json");
//		 JSONObject jsonObject = JSONObject.parseObject(JsonContext);
//		 jsonObject=jsonObject.getJSONObject("data").getJSONObject("data");
//	        for (Map.Entry entry : jsonObject.entrySet()) {
//	        	JSONObject item=JSONObject.parseObject(entry.getValue().toString());
//	        	Jijin jijin=new Jijin();
//	        	jijin.setId(StringUtil.getUUID());
//	        	jijin.setCode(item.getString("code"));
//	        	jijin.setName(item.getString("name"));
//	        	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	        	String newdate=item.getString("newdate");
//	        	if(newdate==null||newdate.isEmpty()){
//	        		continue;
//	        	}
//	        	jijin.setNewdate(sdf.parse(newdate));
//	        	Object f003N_FUND33=item.get("F003N_FUND33");
//	        	
//	        	if(f003N_FUND33==null||f003N_FUND33.toString().isEmpty()){
//	        		continue;
//	        	}
//	        	try{
//	        	jijin.setF003nFund33(item.getDouble("F003N_FUND33"));
//	        	}catch(Exception e){
//	        		System.out.println("");
//	        	}
//	        	Object f008=item.get("F008");
//	        	jijin.setF008(f008==null?0:Double.parseDouble(f008.toString()));
//	        	Object f009=item.get("F009");
//	        	jijin.setF009(f009==null?0:Double.parseDouble(f009.toString()));
//	        	Object f011=item.get("F011");
//	        	jijin.setF011(f011==null?0:Double.parseDouble(f011.toString()));
//	        	Object f012=item.get("F012");
//	        	jijin.setF012(f012==null?0:Double.parseDouble(f012.toString()));
//	        	Object rate=item.get("rate");
//	        	jijin.setRate(rate==null?0:Double.parseDouble(rate.toString()));
//	        	jijin.setType(item.getString("type"));
//	        	jijinService.add(jijin);
	        	
	           //System.out.println(entry.getKey()+"|"+entry.getValue());
//	        }
//      return jijinService.gettest().toString();  
		try {
			List<Jijin> list=jijinService.gettest();
			if(list!=null&&list.size()>0){
				for(int i=0;i<list.size();i++){
					System.out.println(list.get(i).getName()+"-------------------");
					jijinBondService.addList(JsoupUtil.getGupiaoByJijinCode(list.get(i).getCode()));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
    }  
	
	
	
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
	
}
