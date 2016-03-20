/**
 * 
 */
package com.metro.university.charts;

import java.util.ArrayList;
import java.util.List;

import com.metro.university.entity.DataEntity;
import com.metro.university.entity.SettingsEntity;

/**
 * @author elpai
 *
 */
public class IntervalChart {

	public static List<KeyValue> getVertical(List<DataEntity> item, SettingsEntity settings) {
		List<KeyValue> chart = new ArrayList<KeyValue>();
		Integer width = 100;
		Integer j;
		String quick = "false";
		Integer step = 1;
		double len = settings.getLength();
		KeyValue kv = null;
		if (quick.equals("true")) {
			step = item.size() / width;
		}

		for (j = 0; j < item.size(); j += step) {
			DataEntity dataEntity = item.get(j);
			Double y = dataEntity.getVerticalLength();
			kv = new KeyValue((j * len) / 10, y);
			chart.add(kv);
		}
		return chart;
	}

	public static List<KeyValue> getHorizontal(List<DataEntity> item, SettingsEntity settings) {
		List<KeyValue> chart = new ArrayList<KeyValue>();
		Integer width = 100;
		Integer j;
		String quick = "false";
		Integer step = 1;
		double len = settings.getLength();
		KeyValue kv = null;
		if (quick.equals("true")) {
			step = item.size() / width;
		}
		for (j = 0; j < item.size(); j += step) {
			DataEntity dataEntity = item.get(j);
			Double y = dataEntity.getHorizontalLength();
			kv = new KeyValue((j * len) / 10, y);
			chart.add(kv);
		}
		return chart;
	}

	public static class KeyValue {
		Double key;
		Double value;

		public KeyValue(Double key, Double value) {
			super();
			this.key = key;
			this.value = value;
		}

		public Double getKey() {
			return key;
		}

		public void setKey(Double key) {
			this.key = key;
		}

		public Double getValue() {
			return value;
		}

		public void setValue(Double value) {
			this.value = value;
		}

	}

}
