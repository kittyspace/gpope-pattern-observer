package com.gp.opelyan.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/10/17 17:14
 */
public class GPerQuestEventTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        Teacher teacher1 = new Teacher("Tom");
        Teacher teacher2 = new Teacher("Mic");
        eventBus.register(teacher1);
        eventBus.register(teacher2);

        Question question = new Question();
        question.setUserName("小花");
        question.setContent("观察者设计模式的Guava API实现是这样的吗？");

        eventBus.post(question);

    }



}
