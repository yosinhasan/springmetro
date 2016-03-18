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
public final class ListUtils {
	/**
	 * Get list part.
	 * 
	 * @param start
	 *            start
	 * @param finish
	 *            finish
	 * @param max
	 *            max
	 * @param list
	 *            list
	 * @return List<DataEntity>
	 */
	public static List<DataEntity> getListPart(Integer start, Integer finish, Integer max,
			List<DataEntity> list) {
		int size = list.size();
		if (finish > size) {
			finish = size;
		}
		return list.subList(start, finish);
	}

	/**
	 * Get max vertical length.
	 * 
	 * @param list
	 *            list
	 * @return Double
	 */
	public static Double getMaxVerticalLength(final List<DataEntity> list) {
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

	/**
	 * Get max horizontal length.
	 * 
	 * @param list
	 *            list
	 * @return Double
	 */
	public static Double getMaxHorizontalLength(final List<DataEntity> list) {
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
