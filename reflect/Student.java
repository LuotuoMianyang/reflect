package com.qunar.reflect;

/**
 * @author liyonghui.li
 * @description
 * @create 2017-11-27 下午5:31
 */
public class Student {

    private int age;

    private String name;

    private String stuNo;

    private int grade;

    public Student(int age, String name, String stuNo, int grade) {
        this.age = age;
        this.name = name;
        this.stuNo = stuNo;
        this.grade = grade;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private void saySth (String sth){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(" :").append(this.grade).append(" ")
                .append(" speak ")
                .append(sth)
                .append("just test something, don't be so curious ");
        System.out.println(sb.toString());
        //return sb.toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", grade=" + grade +
                '}';
    }
}
