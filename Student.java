package com.lingrui.question.T2;

public class Student {
    private String name;
    private String studentId;
    private int score;

    public Student(){
    }

    public Student(String name,String studentId,int score){
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public void introduce(){
        if(score >= 0 && score <= 100){
            System.out.println("我是" + name +"，学号" + studentId + "，成绩" + score);
        } else {
            System.out.println("请输入正确的成绩");
        }
    }

    public void setName(String name){
        this. name = name;
    }

    public String getName(){
        return name;
    }

    public void setStudentId(String studentId){
        this. studentId = studentId;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setScore(int score){
            this. score = score;
    }

    public int getScore(){
        return score;
    }
}
