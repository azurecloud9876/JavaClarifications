package com.main.exercise3.comparatorexample;

import java.util.List;
import java.util.Map;

public interface IData<T> {
    List<T> getListData();

    Map<T, T> getMapData();
}
