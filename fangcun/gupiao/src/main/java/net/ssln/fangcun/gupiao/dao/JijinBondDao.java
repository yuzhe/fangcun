package net.ssln.fangcun.gupiao.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import net.ssln.fangcun.gupiao.domain.JijinBond;

@Mapper  
public interface JijinBondDao {
	 @Insert("insert into t_gupiao_jijin_bond (id,code,zcname,zccode,zctype,ccRate,endDate,hold,oldzcCode,totalPrice) values(#{id},#{code},#{zcname},#{zccode},#{zctype},#{ccrate},#{enddate},#{hold},#{oldzccode},#{totalprice})")  
	  public int add(JijinBond param);   
}
