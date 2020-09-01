package com.shenchunhang.designpattern.template.demo;

public class TemplatePatternTest {
    public static void main(String[] args) {
        BaseGame game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
