package com.itheima.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {

    //创建一个二维数组(由于在初始化数据和初始化图像时都会用到, 所以在成员方法中定义)
    int[][] data = new int[4][4];


    public GameJFrame() {
        //界面初始化
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据(其实就是对二维数组进行打乱, 在初始化图像时就可以根据打乱的二维数组进行图片的加载)
        initData();

        //初始化图像
        initImage();

        //让界面显示出来, 建议写在最后
        this.setVisible(true);
    }

    private void initData() {
        //1. 定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2. 打乱数组中数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据, 跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        //5. 给二维数组添加数据
        //解法一:
        //遍历一维数组tempArr得到每一个元素, 把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

    }

    private void initImage() {
        //初始化图像

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载的图片序号
                int num = data[i][j];
                //创建一个图片ImageIcon的对象
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\basic-code\\pazzlegame\\image\\animal\\animal3\\" + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                //把管理容器添加到界面
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }


    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象(功能 关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);


    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消内部居中放置
        this.setLayout(null);

    }
}
