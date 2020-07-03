package net.ssln.fangcun.collection.dao;

import org.springframework.stereotype.Repository;

import net.ssln.fangcun.collection.domain.Task;

public interface TaskDao {
 
    int deleteByPrimaryKey(String id);
    int insert(Task record);
    Task selectByPrimaryKey(String id);
    Task selectByurl(String url);
    int updateByPrimaryKey(Task record);
}