package net.ssln.fangcun.gupiao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.ssln.fangcun.gupiao.dao.JijinBondDao;
import net.ssln.fangcun.gupiao.dao.JijinDao;
import net.ssln.fangcun.gupiao.domain.Jijin;
import net.ssln.fangcun.gupiao.domain.JijinBond;
import net.ssln.fangcun.gupiao.service.JijinBondService;

@Service
public class JijinBondServiceImpl implements JijinBondService{
	@Resource
	private JijinBondDao jijinBondDao;

	@Override
	public int add(JijinBond jijinBond) {
		return jijinBondDao.add(jijinBond);
	}

	@Override
	public int addList(List<JijinBond> list) {
		if(list!=null&&list.size()>0){
			for(int i=0;i<list.size();i++){
				jijinBondDao.add(list.get(i));
			}
		}
		return 0;
	}
}
