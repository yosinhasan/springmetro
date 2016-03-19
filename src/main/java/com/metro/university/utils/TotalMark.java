package com.metro.university.utils;

import java.util.ArrayList;
import java.util.List;

import com.metro.university.entity.DataEntity;
import com.metro.university.entity.PicketEntity;

/**
 * @author elpai
 */
public class TotalMark {
    /**
     * Picket entities.
     */
    private List<PicketEntity> picketEntities;
    /**
     * Data entities.
     */
    private List<DataEntity> dataEntities;
    /**
     * Result.
     */
    private ArrayList<String> result;

    /**
     * Constructor.
     *
     * @throws Exception exception
     */
    public TotalMark(final List<PicketEntity> pEntities, final List<DataEntity> dEntity) throws Exception {
        this.picketEntities = pEntities;
        this.dataEntities = dEntity;
        doInBackground();
    }

    /**
     * Do In Background.
     *
     * @throws Exception exception
     */
    private void doInBackground() throws Exception {

        result = new ArrayList<String>();

        double length = Double.parseDouble("2.35");
        int countOnMeter = (int) Math.floor(100 / length);

        for (int i = 1; i < picketEntities.size(); i++) {
            double totalMarkHor = 0, totalMarkVer = 0;
            PicketEntity picketEntity = picketEntities.get(i);
            int start = picketEntity.getStartPoint();
            int max = picketEntity.getFinishPoint();
            for (int j = start; j < max; j += countOnMeter) {
                List<DataEntity> list = ListUtils.getListPart(j, j + countOnMeter, max, dataEntities);
                double maxVertical = ListUtils.getMaxVerticalLength(list);
                double maxHorizontal = ListUtils.getMaxHorizontalLength(list);
                totalMarkHor += getHorizontalMark(maxHorizontal);
                totalMarkVer += getVerticalMark(maxVertical);
            }
            result.add(picketEntity.getInformation() + ".<br/>Сумма баллов по горизонтали: " + totalMarkHor + ", оценка - "
                    + getTotalMark(totalMarkHor, 15, 30, 250) + ".<br/>Сумма баллов по вертикали: " + totalMarkVer
                    + ", оценка - " + getTotalMark(totalMarkVer, 15, 30, 250) + ".");
        }
    }

    /**
     * Get result.
     *
     * @return ArrayList<String>
     */
    public ArrayList<String> getResult() {
        return result;
    }

    /**
     * Get vertical mark.
     *
     * @param num num
     * @return Integer
     */
    private Integer getVerticalMark(Double num) {

        num = Math.abs(num);

        if (num <= 6)
            return 0;
        else if (num <= 10)
            return 2;
        else if (num <= 14)
            return 15;
        else
            return 150;
    }

    /**
     * Get horizontal mark.
     *
     * @param num num
     * @return Integer
     */
    private Integer getHorizontalMark(Double num) {
        num = Math.abs(num);
        if (num <= 8)
            return 0;
        else if (num <= 13)
            return 2;
        else if (num <= 18)
            return 15;
        else
            return 150;
    }

    /**
     * Get total mark.
     *
     * @param num   num
     * @param eMark excellent mark
     * @param gMark good mark
     * @param bMark bad mark
     * @return String
     */
    private String getTotalMark(final Double num, final Integer eMark, final Integer gMark, final Integer bMark) {
        if (num < eMark)
            return "Отлично";
        else if (num < gMark)
            return "Хорошо";
        else if (num < bMark)
            return "Удовлетворительно";
        else
            return "Неудовлеторительно";
    }
}
