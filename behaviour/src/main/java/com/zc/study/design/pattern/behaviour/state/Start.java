package com.zc.study.design.pattern.behaviour.state;

/**
 * 开始状态
 *
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:19
 **/
public class Start implements State {



    @Override
    public void stateAction(Context context) {

        System.out.println("做开始状态的事情");

        context.setState(new Processing());

    }
}
