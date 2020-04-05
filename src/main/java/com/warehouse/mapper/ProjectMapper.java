package com.warehouse.mapper;

import com.warehouse.pojo.Project;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProjectMapper {

    List<String> getAllProjectInfo(@Param(value = "username") String username);

    List<Project> getProjectInfo(@Param(value = "username") String username);

    void updateProject(Project project);

    void deleteProject(@Param(value = "id") String id);

    void addProject(Project project);
}
