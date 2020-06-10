package com.lingtu.lampcontrol.service.impl;

import com.lingtu.lampcontrol.mapper.CtlLoopMapper;
import com.lingtu.lampcontrol.pojo.CtlLoop;
import com.lingtu.lampcontrol.pojo.CtlLoopExample;
import com.lingtu.lampcontrol.service.CtlLoopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CtlLoopServiceImpl.java
 * @Description 回路控制器
 * @Author 朱福盛
 * @Date 2020/6/10 12:40
 * @Version 1.0
 */
@Service
public class CtlLoopServiceImpl implements CtlLoopService {
    @Resource
    private CtlLoopMapper ctlLoopMapper;

    @Override
    public List<CtlLoop> listCtlLoopByObj(CtlLoop ctlLoop) {
        CtlLoopExample example = new CtlLoopExample();
        CtlLoopExample.Criteria criteria = example.createCriteria();
        return ctlLoopMapper.selectByExample(example);
    }
}
