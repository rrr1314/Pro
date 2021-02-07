package com.cvs.System;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月25日 15:01:00
 */
public class System {

    public static void main(final String[] args) {
        controller();
    }

    public static void controller() {
        view();
    }

    public static void view() {


        final ArrayList<com.cvs.test.Student> studentList = new ArrayList<>();


        final Scanner st = new Scanner(java.lang.System.in);
        while (true) {
            java.lang.System.out.println("--------欢迎使用学生系统--------");
            java.lang.System.out.println("1.添加学生信息");
            java.lang.System.out.println("2.删除学生信息");
            java.lang.System.out.println("3.修改学生信息");
            java.lang.System.out.println("4.查看所有学生");
            java.lang.System.out.println("5.退出");


            java.lang.System.out.println("请输入您的选择");


            final String str = st.nextLine();
            switch (str) {
                case "1":
                    //添加学生
                    addStudent(studentList, st);
                    break;
                case "2":
                    //删除学生
                    deleSystemudent(studentList, st);
                    break;
                case "3":
                    //修改学生
                    updaSystemudent(studentList, st);
                    break;
                case "4":
                    //查询学生
                    selectStudent(studentList);
                    break;
                case "5":
                    java.lang.System.out.println("谢谢使用");
                    java.lang.System.exit(0);
                    break;
                default:
                    java.lang.System.out.println("您的输入有误!");
            }
        }
    }

    //添加学生
    public static void addStudent(final ArrayList<com.cvs.test.Student> studentList, final Scanner st) {

        String sdutentId;

        while (true) {

            java.lang.System.out.println("请输入学号");

            sdutentId = st.nextLine();
            //判断学员是否已存在
            if (isused(sdutentId, studentList)) {
                java.lang.System.out.println("添加失败, 该学号已存在!");
            } else {
                break;
            }
        }

        java.lang.System.out.println("请输入学生姓名");

        final String sdutentName = st.nextLine();

        java.lang.System.out.println("请输入学生年龄");

        final String sdutentAge = st.nextLine();

        java.lang.System.out.println("请输入学生地址");

        final String sdutentAddress = st.nextLine();

        studentList.add(new com.cvs.test.Student(sdutentId, sdutentName, sdutentAge, sdutentAddress));
        java.lang.System.out.println("添加成功!");
    }

    //修改学生信息
    private static void updaSystemudent(final ArrayList<com.cvs.test.Student> studentList, final Scanner st) {

        java.lang.System.out.println("请输入您要修改学生的学号:");

        final String studentId = st.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentId.equals(studentList.get(i).getId())) {
                final String strI = Integer.toString(i);

                java.lang.System.out.println("请输入学生的新姓名: ");
                final String studentName = st.nextLine();

                java.lang.System.out.println("请输入学生的新年龄: ");
                final String studentAge = st.nextLine();

                java.lang.System.out.println("请输入学生的新地址: ");
                final String studentAddress = st.nextLine();

                studentList.set(i, new com.cvs.test.Student(strI, studentName, studentAge, studentAddress));
                java.lang.System.out.println("修改成功!");
                return;
            }
        }
        java.lang.System.out.println("修改失败, 不存在该学号的学生!");
    }

    //删除指定学生
    private static void deleSystemudent(final ArrayList<com.cvs.test.Student> studentList, final Scanner st) {

        java.lang.System.out.println("请输入您要删除学生的学号");

        final String sdutentId = st.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if (sdutentId.equals(studentList.get(i).getId())) {
                studentList.remove(i);
                java.lang.System.out.println("删除成功!");
                return;
            }
        }
        java.lang.System.out.println("删除失败, 不存在您要删除的学生!");

    }

    //查询所有学生信息
    private static void selectStudent(final ArrayList<com.cvs.test.Student> studentList) {


        java.lang.System.out.println("----------------------------------------------");
        java.lang.System.out.println("学号" + "\t" + "\t" + "|" + "\t" + "姓名" + "\t" + "\t" + "|" + "\t" + "年龄" + "\t" + "\t" + "|" + "\t" + "地址" + "\t" + "\t" + "|");
        java.lang.System.out.println("----------------------------------------------");
        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.size() == 0) {
                java.lang.System.out.println("无学生信息");
                return;
            }

            java.lang.System.out.print(studentList.get(i).getId() + "\t" + "\t" + "|" + "\t");
            java.lang.System.out.print(studentList.get(i).getName() + "\t" + "\t" + "|" + "\t");
            java.lang.System.out.print(studentList.get(i).getAge() + "\t" + "\t" + "|" + "\t");
            java.lang.System.out.println(studentList.get(i).getAddress() + "\t" + "\t" + "|" + "\t");
            java.lang.System.out.println("----------------------------------------------");
        }
    }


    //判断学生学号是否已存在
    public static boolean isused(final String inputId, final ArrayList<com.cvs.test.Student> studentList) {

        for (final com.cvs.test.Student student : studentList) {
            if (inputId.equals(student.getId())) {
                return true;
            }
        }
        return false;
    }
}
