package com.warehouse.service.impl;

import com.warehouse.mapper.ProjectMapper;
import com.warehouse.pojo.Project;
import com.warehouse.pojo.Users;
import com.warehouse.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<String> getAllProjectInfo(Users users) {
//        users.setUsername("123");
        return projectMapper.getAllProjectInfo(users.getUsername());
    }

    @Override
    public List<Project> getProjectInfo(String username) {
        return projectMapper.getProjectInfo(username);
    }

    @Override
    public void updateProject(Project project) {
        projectMapper.updateProject(project);
    }

    @Override
    public void deleteProject(String id) {
        projectMapper.deleteProject(id);
    }

    @Override
    public void addProject(Project project) {
        projectMapper.addProject(project);
    }
}
