package com.zc.study.design.pattern.behaviour.state;

/**
 * @author Daniel Zheng
 * @create 2018-11-11 下午7:22
 **/
public class Client {

    public static void main(String... args){

        Context context = new BaseContext();

        context.setState(new Start());

        context.getState().stateAction(context);

        context.getState().stateAction(context);

        context.getState().stateAction(context);

    }

}
