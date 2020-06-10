package com.lingtu.lampcontrol.mapper;

import com.lingtu.lampcontrol.pojo.CtlLoop;
import com.lingtu.lampcontrol.pojo.CtlLoopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CtlLoopMapper {
    int countByExample(CtlLoopExample example);

    int deleteByExample(CtlLoopExample example);

    int deleteByPrimaryKey(Long loopId);

    int insert(CtlLoop record);

    int insertSelective(CtlLoop record);

    List<CtlLoop> selectByExampleWithRowbounds(CtlLoopExample example, RowBounds rowBounds);

    List<CtlLoop> selectByExample(CtlLoopExample example);

    CtlLoop selectByPrimaryKey(Long loopId);

    int updateByExampleSelective(@Param("record") CtlLoop record, @Param("example") CtlLoopExample example);

    int updateByExample(@Param("record") CtlLoop record, @Param("example") CtlLoopExample example);

    int updateByPrimaryKeySelective(CtlLoop record);

    int updateByPrimaryKey(CtlLoop record);
}