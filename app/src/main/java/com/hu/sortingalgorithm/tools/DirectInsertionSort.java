package com.hu.sortingalgorithm.tools;

/**
 * Created by q623407474 on 2016/8/27.
 * 直接插入排序
 */
public class DirectInsertionSort extends BaseData{

    public void insertSort(){
        int temp = 0;
        int length = data.length;
        for(int i=1;i<length;i++){
            int j=i-1;
            temp=data[i];
            for(;j>=0&&temp<data[j];j--){
                data[j+1]=data[j];  //将大于temp的值整体后移一个单位
            }
            data[j+1]=temp;
        }

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }

    }

}
