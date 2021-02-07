package com.cvs.domain;

import com.cvs.bean.Student;
import com.cvs.utill.Utiils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月02日 10:01:00
 */
public class Star {


    public static void main(String[] args) throws Exception{

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Utiils.home(students, sc);
    }
}
