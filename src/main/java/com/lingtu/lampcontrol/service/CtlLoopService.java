package com.lingtu.lampcontrol.service;

import com.lingtu.lampcontrol.pojo.CtlLoop;

import java.util.List;

/**
 * @InterfaceName CtlLoopService.java
 * @Description 回路控制器
 * @Author 朱福盛
 * @Date 2020/6/10 12:39
 * @Version 1.0
 */
public interface CtlLoopService {
    List<CtlLoop> listCtlLoopByObj(CtlLoop ctlLoop);
}
