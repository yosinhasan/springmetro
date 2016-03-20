package com.metro.university.utils;


import org.jfree.chart.JFreeChart;
import com.metro.university.entity.DataEntity;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.*;
import java.util.List;

public class Graphic {

    private static JFreeChart chartHorizontal;
    private static JFreeChart chartVertical;

    public Graphic(List<DataEntity> list) {
        doInBackground(list);
    }

    private void doInBackground(List<DataEntity> list) {
        XYSeries horizontalSeries = new XYSeries("Отклонение");
        XYSeries verticalSeries = new XYSeries("Отклонение");
        double len = Double.parseDouble("2.35");
        int j;
        int step = 1;
        for (j = 0; j < list.size(); j += step) {
            DataEntity dataEntity = list.get(j);
            double y = dataEntity.getHorizontalLength();
            horizontalSeries.add(j * len / 10, y, false);
            double z = dataEntity.getVerticalLength();
            verticalSeries.add(j * len / 10, z, false);
        }

        chartHorizontal = createIntervalChart("Отклонения по горизонтали", "Расстояние (м)", "Отклонение", horizontalSeries, 0, j * len / 10);
        chartVertical = createIntervalChart("Отклонения по вертикали", "Расстояние (м)", "Отклонение", verticalSeries, 0, j * len / 10);
    }

    private JFreeChart createIntervalChart(String title, String xAxisTitle, String yAxisTitle, XYSeries series, double mixXValue, double maxXValue) {
        IntervalXYDataset dataset = new XYSeriesCollection(series);
        XYBarRenderer renderer1 = new XYBarRenderer(0.20000000000000001D);
        NumberAxis domainAxis = new NumberAxis(xAxisTitle);
        domainAxis.setRange(mixXValue, maxXValue);
        NumberAxis valueAxis = new NumberAxis(yAxisTitle);
        valueAxis.setAutoRange(true);
        XYPlot plot = new XYPlot(dataset, domainAxis, valueAxis, renderer1);
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinePaint(Color.WHITE);
        return new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT, plot, true);

    }

    public static JFreeChart getChartHorizontal() {
        return chartHorizontal;
    }

    public static JFreeChart getChartVertical() {
        return chartVertical;
    }
}
