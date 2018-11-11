package com.zc.study.design.pattern.behaviour.state;

/**
 * 上下文基类
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:18
 **/
public class BaseContext implements Context{


    private State state;

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}
