package com.cvs.utill;

import com.cvs.bean.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月02日 09:59:00
 */
public class Utiils {

    //学生ID
    private static int sid;
    //老师ID
    private static int tid;


    private Utiils() {
    }


    public static void home(ArrayList<Student> students, Scanner sc) throws Exception{


        while (true){
            System.out.println("--------欢迎进入师范大学管理系统--------");
            java.lang.System.out.println("1.进入教师管理系统");
            java.lang.System.out.println("2.进入学员管理系统");
            java.lang.System.out.println("3.退出");

            String s = sc.nextLine();

            switch(s){
                case "1":
                    //进入教师管理系统
                    break;
                case "2":
                    //进入学员管理系统
                    studentAdmin(students, sc);
                    break;
                    //退出
                case "3":
                    return;
                default:
                    System.out.println("您的输入有误, 请重新输入!");
            }
        }
    }


    public static void studentAdmin(ArrayList<Student> students, Scanner sc) throws Exception{
        while (true){
            System.out.println("--------欢迎使用学生系统--------");
            java.lang.System.out.println("1.添加学生信息");
            java.lang.System.out.println("2.删除学生信息");
            java.lang.System.out.println("3.修改学生信息");
            java.lang.System.out.println("4.查看所有学生");
            java.lang.System.out.println("5.返回");

            java.lang.System.out.println("请输入您的选择");

            String s = sc.nextLine();

            switch(s){
                case "1":
                    //添加学生
                    addStudent(students, sc);
                    break;
                case "2":
                    //删除学生
                    deleteStudent(students, sc);
                    showStudent(students);
                    break;
                case "3":
                    //修改学生
                    editStudent(students, sc);
                    break;
                case "4":
                    //查看所有学生
                    showStudent(students);
                    break;
                case "5":
                    //返回
                    return;
                default:
                    System.out.println("您的输入有误, 请重新输入!");
            }
        }
    }


    //添加学生
    public static void addStudent(ArrayList<Student> students, Scanner sc) throws Exception{

        //请输入姓名
        System.out.println("请输入姓名:");
        String sName = sc.nextLine();

        //请输入性别
        System.out.println("请输入性别:");
        String sSex = sc.nextLine();

        //请输入生日
        System.out.println("请输入生日: 格式(2020-12-12)");
        String sShengri = sc.nextLine();

        //请输入地址
        System.out.println("请输入地址");
        String sAddress = sc.nextLine();

        //请输入手机号码
        System.out.println("请输入手机号码");
        String sNumber = sc.nextLine();;

        Student stu = new Student(++sid,sName,sSex,Utiils.dateToAge(sShengri),sAddress,sNumber,sShengri);

        students.add(stu);
    }

    //查看所有学生
    public static void showStudent(ArrayList<Student> students){

        java.lang.System.out.println("------------------------------------------------------------------------------------------------");
        java.lang.System.out.println("学号" + "\t" + "\t" + "|" + "\t" + "姓名" + "\t" + "\t" + "|" + "\t" + "性别" +"\t" + "\t" + "|" + "\t" + "年龄" + "\t"  + "\t" + "|" + "\t" + "手机号" + "\t" + "\t" + "|" + "\t" + "地址" + "\t" + "\t" + "|" + "\t" + "\t" + "生日" + "\t" + "\t" + "|" );
        java.lang.System.out.println("------------------------------------------------------------------------------------------------");

        if (students.size() == 0){
            System.out.println("暂无学员信息");
            return;
        }

        for (Student student : students) {
            System.out.print(student.getId() + "\t" + "\t" + "|" + "\t");
            System.out.print(student.getName() + "\t" + "\t" + "|" + "\t");
            System.out.print(student.getSex() + "\t" + "\t" + "|" + "\t");
            System.out.print(student.getAge() + "\t" + "\t" + "|" + "\t");
            System.out.print(student.getNumber() + "\t" + "|" + "\t" + "\t");
            System.out.print(student.getAddress() + "\t" + "|" + "\t");
            System.out.println(student.getShengri() + "\t" + "|" + "\t");
            System.out.println("------------------------------------------------------------------------------------------------");
        }
    }

    //查看单个学生
    public static void showStudent(Student stu){

        java.lang.System.out.println("-------------------------------------------------------------------------------------------");
        java.lang.System.out.println("学号" + "\t" + "\t" + "|" + "\t" + "姓名" + "\t" + "\t" + "|" + "\t" + "性别" +"\t" + "\t" + "|" + "\t" + "年龄" + "\t"  + "\t" + "|" + "\t" + "手机号" + "\t" + "\t" + "|" + "\t" + "地址" + "\t" + "\t" + "|" + "\t" +  "\t" + "生日" + "\t" + "\t" + "|" );
        java.lang.System.out.println("------------------------------------------------------------------------------------------------");

        System.out.print(stu.getId() + "\t" + "\t" + "|" + "\t");
        System.out.print(stu.getName() + "\t" + "\t" + "|" + "\t");
        System.out.print(stu.getSex() + "\t" + "\t" + "|" + "\t");
        System.out.print(stu.getAge() + "\t" + "\t" + "|" + "\t");
        System.out.print(stu.getNumber() + "\t" + "|" + "\t" + "\t");
        System.out.print(stu.getAddress() + "\t" + "|" + "\t");
        System.out.println(stu.getShengri() + "\t" + "|" + "\t");
        java.lang.System.out.println("------------------------------------------------------------------------------------------------");

    }

    //修改学生
    public static void editStudent(ArrayList<Student> students, Scanner sc) throws Exception{

        System.out.println("请输入您要修改的学员编号: ");
        String s = sc.nextLine();

        for (Student student : students) {
            if (String.valueOf(students.get(0).getId()).equals(s)){
                showStudent(student);

                //请输入姓名
                System.out.println("请输入姓名:");
                String sName = sc.nextLine();

                //请输入性别
                System.out.println("请输入性别:");
                String sSex = sc.nextLine();

                //请输入生日
                System.out.println("请输入生日: 格式(2020-12-12)");
                String sShengri = sc.nextLine();

                //请输入地址
                System.out.println("请输入地址");
                String sAddress = sc.nextLine();

                //请输入手机号码
                System.out.println("请输入手机号码");
                String sNumber = sc.nextLine();

                student.setName(sName);
                student.setSex(sSex);
                student.setShengri(sShengri);
                student.setAge(Utiils.dateToAge(sShengri));
                student.setAddress(sAddress);
                student.setNumber(sNumber);

                return;
            }
        }
        System.out.println("修改失败, 不存在该学员!");

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> students, Scanner sc){

        System.out.println("请输入您要删除的学员编号");

        String st = sc.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (String.valueOf(students.get(i).getId()).equals(st)){
                System.out.println("您确认是否要删除该学生吗? [y/n]");
                String s = sc.nextLine();
                if (s.equals("n")){
                    System.out.println("操作已取消!");
                    return;
                }
                students.remove(i);
                System.out.println("删除成功!");
                return;
            }
        }
        System.out.println("[失败] 不存在该学员!");
    }


    //根据用户输入的生日 计算出年龄
    public static int dateToAge(String date) throws Exception{

        //根据输入的生日 计算出年龄
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = df.parse(date);

        //用户输入的日期
        Calendar inpuDate = Calendar.getInstance();
        inpuDate.setTime(inputDate);

        //当前日期
        Calendar nowDate = Calendar.getInstance();


        if (inpuDate.before(nowDate)){
            //输入的日期在当前时间的前面 (符合)
            int nowmonth = nowDate.get(Calendar.MONTH);//当前月
            //不足月  所以年龄要减一
            if (inpuDate.get(Calendar.MONTH) > nowmonth || inpuDate.get(Calendar.MONTH) == nowmonth && inpuDate.get(Calendar.DAY_OF_MONTH) > nowDate.get(Calendar.DAY_OF_MONTH)){
                return (nowDate.get(Calendar.YEAR) - inpuDate.get(Calendar.YEAR)) - 1;
            }
            return nowDate.get(Calendar.YEAR) - inpuDate.get(Calendar.YEAR);
        }else{
            //输入的日期比当前日期晚 (不符合)
            System.out.println("您输入的日期有误, 请重新填写");
            return -1;
        }
    }
}
