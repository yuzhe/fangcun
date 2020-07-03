package net.ssln.fangcun.gupiao.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.ssln.fangcun.gupiao.domain.Jijin;

@Mapper  
public interface JijinDao {
	  @Select("select * from  t_gupiao_jijin")  
	    public List<Jijin> testlist();  
	  @Insert("insert into t_gupiao_jijin(id,name,code,newdate,F003N_FUND33,F008,F009,F011,F012,rate,type) values(#{id},#{name},#{code},#{newdate},#{f003nFund33},#{f008},#{f009},#{f011},#{f012},#{rate},#{type})")  
	  public int add(Jijin param);  
}
