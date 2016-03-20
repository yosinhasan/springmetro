package com.metro.university.views;

import com.metro.university.entity.DataEntity;
import com.metro.university.utils.Graphic;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.jfree.chart.JFreeChart;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by elpai on 20.03.16.
 */
public class DataEntityView extends AbstractExcelView {
    private Integer picturesPositon = 0;
    @Override
    protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook hssfWorkbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        HSSFSheet excelSheet = hssfWorkbook.createSheet("DataEntity List");
        setExcelHeader(excelSheet);
        List<DataEntity> dataEntityList = (List<DataEntity>) map.get("dataEntityList");
        setExcelRows(excelSheet, dataEntityList);
        Graphic graphic = new Graphic(dataEntityList);
        createPricture(Graphic.getChartHorizontal(), excelSheet.getWorkbook(), excelSheet, excelSheet.getWorkbook().getCreationHelper(), 5, picturesPositon).resize();
        createPricture(Graphic.getChartVertical(), excelSheet.getWorkbook(), excelSheet, excelSheet.getWorkbook().getCreationHelper(), 5, picturesPositon + 22).resize();
        picturesPositon = 0;
    }

    public void setExcelHeader(HSSFSheet excelSheet) {
        HSSFRow excelHeader = excelSheet.createRow(0);
        excelHeader.createCell(0).setCellValue("Номер отсчета");
        excelHeader.createCell(1).setCellValue("По горизонтали");
        excelHeader.createCell(2).setCellValue("По вертикали");
    }

    public void setExcelRows(HSSFSheet excelSheet, List<DataEntity> list) {
        int record = 1;
        for (DataEntity entity : list) {
            HSSFRow excelRow = excelSheet.createRow(record++);
            excelRow.createCell(0).setCellValue(entity.getPointNumber());
            excelRow.createCell(1).setCellValue(entity.getHorizontalLength());
            excelRow.createCell(2).setCellValue(entity.getVerticalLength());
        }
        picturesPositon = record;
    }

    private Picture createPricture(JFreeChart chart, Workbook workbook, Sheet sheet, CreationHelper helper, int x, int y) throws Exception {
        BufferedImage chartImage = chart.createBufferedImage(800, 400);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(chartImage, "png", baos);
        byte[] bytes = baos.toByteArray();
        int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
        Drawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor anchor = helper.createClientAnchor();
        anchor.setCol1(x);
        anchor.setRow1(y);
        return drawing.createPicture(anchor, pictureIdx);
    }
}
