package com.zc.study.design.pattern.behaviour.state;

/**
 * 终止状态
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:21
 **/
public class End implements State {
    @Override
    public void stateAction(Context context) {

        System.out.println("终止状态");

    }
}
