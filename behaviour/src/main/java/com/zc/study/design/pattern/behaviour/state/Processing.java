package com.zc.study.design.pattern.behaviour.state;

/**
 * 处理中状态
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:20
 **/
public class Processing implements State {
    @Override
    public void stateAction(Context context) {

        System.out.println("处理中");

        context.setState(new End());

    }
}
