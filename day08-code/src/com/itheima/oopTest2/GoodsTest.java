package com.itheima.oopTest2;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        //创建3个商品对象
        Goods g1 = new Goods("001","华为P40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",227.0,50);
        Goods g3 = new Goods("003","枸杞",12.7,70);

        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods good = arr[i];
            System.out.println(good.getId() + ", " + good.getName() + ", " + good.getPrice() + ", " + good.getCount());
        }
    }
}
