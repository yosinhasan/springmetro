package com.metro.university.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;

import com.metro.university.entity.DataEntity;
import com.metro.university.entity.PicketEntity;

public class ReadFile {
	private File file;
	private Properties props;
	private ArrayList<DataEntity> dataEntities;
	private LinkedList<PicketEntity> picketEntities;

	public ReadFile(final File file) {
		this.file = file;
	}

	private void doInBackground() throws Exception {
		dataEntities = new ArrayList<DataEntity>();
		picketEntities = new LinkedList<PicketEntity>();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String info = reader.readLine();
			String info1 = reader.readLine();
			int curr = 0;
			long len = file.length();

			String line = "";
			int i = 0;
			int current = 0;

			while ((line = reader.readLine()) != null) {
				curr += line.getBytes("ISO-8859-2").length + 2;
				String[] data = line.split(",");
				if (data.length == 3) {
					DataEntity dataEntity = new DataEntity();
					dataEntity.setPointNumber(Long.parseLong(data[0].trim()));
					dataEntity.setVerticalLength(getVerticalDeviation(Integer.parseInt(data[1].trim())));
					dataEntity.setHorizontalLength(getHorizontalDeviation(Integer.parseInt(data[2].trim())));
					dataEntities.add(dataEntity);
					i++;
				} else if (data.length == 5) {
					PicketEntity picketEntity = new PicketEntity();
					picketEntity.setInformation("Пикет" + line);
					picketEntity.setStartPoint(i);
					picketEntities.add(picketEntity);
					if (current != 0) {
						PicketEntity tmPicket = picketEntities.get(current - 1);
						tmPicket.setFinishPoint(i);
					}
					current++;
				}
			}
			dataEntities.remove(dataEntities.size() - 1);
			dataEntities.remove(dataEntities.size() - 2);
			PicketEntity tmPicket = picketEntities.getLast();
			tmPicket.setFinishPoint(i - 2);
			PicketEntity allDistance = new PicketEntity();
			allDistance.setInformation("Дистанция");
			allDistance.setStartPoint(0);
			allDistance.setFinishPoint(i - 2);
			picketEntities.addFirst(allDistance);
		} catch (FileNotFoundException ignored) {
		} catch (IOException ignored) {
		}
	}

	public ArrayList<DataEntity> getDataEntities() {
		return dataEntities;
	}

	public LinkedList<PicketEntity> getPicketEntities() {
		return picketEntities;
	}

	private double getVerticalDeviation(Integer num) {
		double subVer = Double.parseDouble(props.getProperty("subVer"));
		double mulVer = Double.parseDouble(props.getProperty("mulVer"));
		return (num - subVer) * (mulVer);
	}

	private double getHorizontalDeviation(Integer num) {
		double subHor = Double.parseDouble(props.getProperty("subHor"));
		double mulHor = Double.parseDouble(props.getProperty("mulHor"));
		return (num - subHor) * (mulHor);
	}
}
