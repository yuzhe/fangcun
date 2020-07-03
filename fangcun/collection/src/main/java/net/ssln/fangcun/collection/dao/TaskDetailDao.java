package net.ssln.fangcun.collection.dao;

import org.springframework.stereotype.Repository;

import net.ssln.fangcun.collection.domain.TaskDetail;

public interface TaskDetailDao {

    int deleteByPrimaryKey(String id);

    int insert(TaskDetail record);

    int insertSelective(TaskDetail record);

  

    TaskDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaskDetail record);

    int updateByPrimaryKey(TaskDetail record);
}