package com.itheima.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userInfo = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose){
                case "1"-> login(userInfo);
                case "2"-> register(userInfo);
                case "3"-> forgetPassword(userInfo);
                case "4"-> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void forgetPassword(ArrayList<User> userInfo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String username = sc.next();
        boolean flag = contains(userInfo,username);
        if(!flag){
            System.out.println("用户名" + username + "未注册,请先完成注册!");
            return;
        }
        System.out.println("请输入身份证号码:");
        String idNumber = sc.next();
        System.out.println("请输入手机号: ");
        String phoneNumber = sc.next();

        //比较用户对象中的手机号码和身份证号码是否相同
        //需要先把用户对象找出来
        int index = getIndexNumber(userInfo,username);
        User user = userInfo.get(index);

        //当输入有误时
        if(!(user.getIdNumber().equalsIgnoreCase(idNumber) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号码或者手机号码输入有误, 不能修改密码!");
            return;
        }

        //当输入正确的时候
        System.out.println("你的密码是: " + user.getPassword());
        System.out.println("你想修改密码吗?(\"1\"表示确定)");
        String sure = sc.next();

        String newId1;
        String newID2;
        if(sure.equals("1")){
            while(true){
                System.out.println("请输入新的密码: ");
                newId1 = sc.next();
                System.out.println("请再次输入新的密码: ");
                newID2 = sc.next();

                if(newId1.equals(newID2)){
                    break;
                }else{
                    System.out.println("两次密码输入不一致");
                    continue;
                }
            }
        }else {
            return;
        }
        //密码校验完毕, 可以修改
        user.setPassword(newID2);
        System.out.println("密码修改成功!");
    }

    private static int getIndexNumber(ArrayList<User> userInfo, String username) {
        int index = 0;
        for (int i = 0; i < userInfo.size(); i++) {
            if(userInfo.get(i).getUsername().equals(username)){
                index = i;
            }
        }
        return index;
    }

    private static void login(ArrayList<User> userInfo) {
        String random = getRandom();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            boolean flag = contains(userInfo,username);

            if (!flag) {
                System.out.println("用户名" + username + "未注册, 请先注册!");
                return;
            }
            System.out.println("请输入密码:");
            String password = sc.next();

            while (true) {
                System.out.println("请输入验证码:" + random);
                String getRandom = sc.next();
                if (!getRandom.equalsIgnoreCase(random)) {
                    System.out.println("验证码错误, 请重新输入!");
                    continue;
                } else {
                    break;
                }
            }

            //验证密码是否正确
            User userCollect = new User(username, password, null, null);
            boolean result = checkPassword(userInfo, userCollect);
            if (result) {
                System.out.println("登录成功, 可以开始使用学生信息管理系统!");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败, 用户名或密码错误!");
                if (i == 2) {
                    System.out.println("您当前的账号被锁定, 请联系相关工作人员!");
                    return;
                }
            }
        }
    }

    private static boolean checkPassword(ArrayList<User> userInfo, User userCollect) {
        for (int i = 0; i < userInfo.size(); i++) {
            User u = userInfo.get(i);
            if(u.getUsername().equals(userCollect.getUsername()) && u.getPassword().equals(userCollect.getPassword())){
                return true;
            }
        }
        return false;
    }

    private static String getRandom() {
        Random r = new Random();
        ArrayList<Character> randomList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            randomList.add((char)('a' + i));
            randomList.add((char)('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(randomList.size());
            char c = randomList.get(index);
            sb.append(c);
        }
        int number = r.nextInt(10);
        sb.append(number);

        //数字在任意位置出现
        //先把字符串编程字符数组, 再在数组中修改
        char[] arr = sb.toString().toCharArray();
        //拿最后索引和随机索引交换
        int randomIndex = r.nextInt(arr.length);

        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

    private static void register(ArrayList<User> userInfo) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        String idNumber;
        String phoneNumber;
        while(true){
            System.out.println("请输入用户名(按\"-1\"回到主菜单)");
            username = sc.next();
            if(username.equals("-1")){
                return;
            }
            //对用户名校验的结果进行判断
            boolean flag1 = checkUsername(username);
            if(!flag1){
                System.out.println("用户名格式有误, 请重新输入!");
                continue;
            }
            boolean flag2 = contains(userInfo,username);
            //如果flag2为真, 则表示集合中已经存在此用户名
            if(flag2){
                System.out.println("用户名\"" + username + "\"已存在, 请重新输入!");
            }else {
                break;
            }
        }
        //到此, 用户名校验已完成
        //下面进行密码校验
        while (true){
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if(!password.equals(againPassword)){
                System.out.println("两次输入的密码不一致, 请重新输入!");
                continue;
            }else{
                break;
            }
        }
        //到这里密码校验完毕
        //下面对身份证号码进行验证
        while (true) {
            System.out.println("请输入身份证号码");
            idNumber = sc.next();
            boolean flag = checkId(idNumber);
            if(!flag){
                System.out.println("身份证号码格式有误, 请重新输入!");
                continue;
            }else {
                break;
            }
        }
        //身份证校验完毕
        //下面对手机号进行校验
        while (true){
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if(!flag){
                System.out.println("手机号码格式有误, 请重新输入!");
                continue;
            }else {
                break;
            }
        }
        //手机号校验完毕
        //!!!把上面的信息都放到用户对象当中
        User u = new User(username,password,idNumber,phoneNumber);
        userInfo.add(u);
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkId(String idNumber) {
        if(idNumber.length() != 18){
            return false;
        }
        if(idNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < idNumber.length() - 1; i++) {
            char c = idNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        char endChar = idNumber.charAt(idNumber.length() - 1);
        if((endChar >= '0' && endChar <= '9')||endChar == 'x'||endChar == 'X'){
            return true;
        }
        return false;
    }

    private static boolean contains(ArrayList<User> userInfo, String username) {
        for (int i = 0; i < userInfo.size(); i++) {
            User u = userInfo.get(i);
            if(u.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    private static boolean checkUsername(String username){
        //用户名长度必须在3~15位之间
        if(username.length() < 3 || username.length() > 15){
            return false;
        }
        //只能是字母加数字的组合，但是不能是纯数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <='z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))){
                return false;
            }
        }
        //当代码执行到这里, 表示已经满足上面的两个要求
        //校验用户名是否是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <='z')||(c >= 'A' && c <= 'Z')){
                count++;
                break;
                //当有一个字符满足要求则直接停止循环,防止无用循环继续
            }

        }
        return count > 0;
    }

}
