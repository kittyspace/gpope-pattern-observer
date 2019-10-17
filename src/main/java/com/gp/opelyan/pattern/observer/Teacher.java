package com.gp.opelyan.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/10/17 17:19
 */
public class Teacher {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question){

        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getUserName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());

    }


}
