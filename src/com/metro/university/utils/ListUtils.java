package com.metro.university.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.metro.university.entity.DataEntity;

/**
 * 
 * @author elpai
 *
 */
public class ListUtils {

	public static List<DataEntity> getListPart(int start, int finish, int max, List<DataEntity> list) {
		if (finish > max)
			finish = max;
		return list.subList(start, finish);
	}

	public static double getMaxVerticalLength(List<DataEntity> list) {
		DataEntity dataEntity = Collections.max(list, new Comparator<DataEntity>() {
			@Override
			public int compare(DataEntity o1, DataEntity o2) {
				double v1 = Math.abs(o1.getVerticalLength());
				double v2 = Math.abs(o2.getVerticalLength());
				if (v1 < v2)
					return -1;
				else if (v1 == v2)
					return 0;
				else
					return 1;
			}
		});
		return dataEntity.getVerticalLength();
	}

	public static double getMaxHorizontalLength(List<DataEntity> list) {
		DataEntity dataEntity = Collections.max(list, new Comparator<DataEntity>() {
			@Override
			public int compare(DataEntity o1, DataEntity o2) {
				double v1 = Math.abs(o1.getHorizontalLength());
				double v2 = Math.abs(o2.getHorizontalLength());
				if (v1 < v2)
					return -1;
				else if (v1 == v2)
					return 0;
				else
					return 1;
			}
		});
		return dataEntity.getHorizontalLength();
	}

}
