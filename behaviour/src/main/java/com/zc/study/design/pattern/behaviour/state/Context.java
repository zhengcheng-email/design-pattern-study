package com.zc.study.design.pattern.behaviour.state;

/**
 * 状态上下文
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:17
 **/
public interface Context {

    State getState();

    void setState(State state);

}
