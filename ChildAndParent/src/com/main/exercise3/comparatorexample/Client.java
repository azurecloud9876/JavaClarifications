package com.main.exercise3.comparatorexample;

import com.main.exercise3.comparatorexample.service.ListDataHelper;
import com.main.exercise3.comparatorexample.service.MapDataHelper;

/*
 * Comparator Java8 examples
 * */
public class Client {


    public static void main(String[] args) {

        ListDataHelper listData = new ListDataHelper();
        listData.getCustomerListData1();

        MapDataHelper mapData = new MapDataHelper();
        mapData.getMapData();

    }
}
