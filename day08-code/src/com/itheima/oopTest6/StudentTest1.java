package com.itheima.oopTest6;

public class StudentTest1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        //定义3名同学
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);

        //把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;

        //要求1: 再次添加一个学生对象,并在添加的时候进行学号的唯一性判断

        Student stu4 = new Student(3,"zhaoliu",26);

        //唯一性判断
        //已存在-----不用添加
        //不存在-----就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if(flag){
            //已存在---不用添加
            System.out.println("当前id重复, 请修改id后再进行添加");
        }else{
            //不存在--就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1.数组已经存满 --- 只能创建一个新的数组, 新数组的长度 = 老数组 + 1
            //2. 数组没有存满 --- 直接添加
            int count = getCount(arr);
            if(count == arr.length){
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
            }else{
                //没有存满
                //[stu1,stu2,null]
                //getCount获取到的是2，表示数组当中已经有了2个元素
                //还有一层意思：如果下一次要添加数据，就是添加到2索引的位置
                arr[count] = stu4;

                printArr(arr);
            }
        }
    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组中的每一个学生对象
            Student stu = arr[i];
            if(stu != null){
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较
                if(sid == id){
                    return true;
                }
            }
        }
        return false;
    }

    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }
}
