package com.shenchunhang.designpattern.template.demo;

/**
 * @author gospel
 */
public abstract class BaseGame {
    /**
     * 准备工作
     */
    abstract void init();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play(){
        this.init();
        this.startPlay();
        this.endPlay();
    }
}
