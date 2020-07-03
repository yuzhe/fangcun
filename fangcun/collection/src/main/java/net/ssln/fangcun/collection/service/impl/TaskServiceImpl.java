package net.ssln.fangcun.collection.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.ssln.fangcun.collection.dao.TaskDao;
import net.ssln.fangcun.collection.domain.Task;
import net.ssln.fangcun.collection.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Resource
	private TaskDao taskDao;

	@Override
	public int add(Task task) {
		return taskDao.insert(task);
	}
}
