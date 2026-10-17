package com.lingrui.question.T2;

import javax.naming.Name;

public class GraduateStudent extends Student{
    private String advisor;

    public GraduateStudent() {
    }

    public GraduateStudent(String name, String studentId, int score, String advisor) {
        super(name, studentId, score);
        this.advisor = advisor;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    @Override
    public void introduce(){
        if(getScore() >= 0 && getScore() <= 100){
            System.out.println("我是" + getName() + "，学号" + getStudentId() + "，成绩" + getScore() + "，我的导师是" + getAdvisor());
        }else {
            System.out.println("请输入正确的成绩");
        }
    }

    public void research(){
        System.out.println("我在做科研");
    }
}
