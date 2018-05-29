package com.gzuni.actuator.mapper.tk;

import com.gzuni.actuator.model.Task;
import com.gzuni.actuator.model.TaskCriteria;
import com.gzuni.actuator.utils.ActuatorMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper extends ActuatorMapper<Task> {
    long countByExample(TaskCriteria example);

    int deleteByExample(TaskCriteria example);

    List<Task> selectByExampleWithBLOBs(TaskCriteria example);

    List<Task> selectByExample(TaskCriteria example);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Task record, @Param("example") TaskCriteria example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskCriteria example);
}