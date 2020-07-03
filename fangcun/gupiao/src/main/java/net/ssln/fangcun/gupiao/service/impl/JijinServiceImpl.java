package net.ssln.fangcun.gupiao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.ssln.fangcun.gupiao.dao.JijinDao;
import net.ssln.fangcun.gupiao.domain.Jijin;
import net.ssln.fangcun.gupiao.service.JijinService;

@Service
public class JijinServiceImpl implements JijinService {
@Resource
private JijinDao jijinDao;

@Override
public List<Jijin> gettest() {
	return jijinDao.testlist();
}

@Override
public int add(Jijin jijin) {
	return jijinDao.add(jijin);
}

}
