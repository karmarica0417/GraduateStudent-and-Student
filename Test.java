package com.lingrui.question.T2;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.introduce();

        Student s2 = new Student("乃森乃森","12345678",0);
        s2.introduce();

        Student s3 = new Student();
        s3.setName("乃林乃林");
        s3.setScore(59);
        s3.setStudentId("87654321");
        s3.introduce();

        Student s4 = new Student();
        s3.setName("乃木乃木");
        s3.setScore(59);
        s3.setStudentId("67676767");
        s3.introduce();

        Student s5 = new Student("karma","23333333",100);
        s5.introduce();

        GraduateStudent gs1 = new GraduateStudent("张三","12344321",100,"李四");
        gs1.introduce();

        Student s = new GraduateStudent("王五","43211234",100,"陈六");
        s.introduce();
        //s.research();
    }
}
