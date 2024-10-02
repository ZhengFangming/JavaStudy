package test;

public class Test3 {
    public static void main(String[] args) {
        //目标：要能区分出什么时候使用带返回值的方法
        //需求：定义方法，比较两个长方形的面积
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);
        if(area1 > area2){
            System.out.println("第一个长方形面积更大");
        }else{
            System.out.println("第二个长方形面积更大");
        }

    }

    public static double getArea(double len, double width){
        double result = len * width;
        return result;
    }

}
