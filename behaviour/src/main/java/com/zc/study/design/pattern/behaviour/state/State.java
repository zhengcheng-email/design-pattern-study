package com.zc.study.design.pattern.behaviour.state;

/**
 * 状态接口
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:10
 **/
public interface State {
    /**
     * 状态对应的方法
     */
    void stateAction(Context context);
}
