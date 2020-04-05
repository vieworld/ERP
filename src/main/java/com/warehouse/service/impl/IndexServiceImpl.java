package com.warehouse.service.impl;

import com.warehouse.Vo.ChartVo;
import com.warehouse.Vo.DayVo;
import com.warehouse.common.DayUtils;
import com.warehouse.common.StringUtils;
import com.warehouse.mapper.IndexMapper;
import com.warehouse.pojo.Users;
import com.warehouse.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IndexServiceImpl implements IndexService {
    private static final int TOTAL = 8;

    @Autowired
    private IndexMapper indexMapper;


    @Override
    public ChartVo getSaleChart(Integer num, Users users) {

        ChartVo chartVo = new ChartVo();
        List<Float> amountList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        List<String> groupNameList = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("username", users.getUsername());
//        map.put("username","123");

        String myTime = null;

        if (num == 0) {

//            System.out.println("进来了。。。。。。。。。。。。");
            myTime = DayUtils.getMonth();
            int dayCount = 0;


            map.put("myTime", myTime);
            int countAmount = indexMapper.getCountAmount(map);
            Float totalAmount = indexMapper.getTotalAmount(map);


            for (int i = 0; i < TOTAL; i++) {


                String minDay = DayUtils.getDay(dayCount);
                dayCount += 3;
                if (dayCount > DayUtils.getMaxDay()) {
                    dayCount = DayUtils.getMaxDay();
                }

                String maxDay = DayUtils.getDay(dayCount);
                dayCount += 1;
                DayVo dayVo = new DayVo();
                dayVo.setMinDay(minDay);
                dayVo.setMaxDay(maxDay);
                dayVo.setUsername(users.getUsername());
//                dayVo.setUsername("123");

                groupNameList.add(StringUtils.DateManage(minDay) + "-" + StringUtils.DateManage(maxDay));
                amountList.add(indexMapper.getAmount(dayVo));
                countList.add(indexMapper.getCount(dayVo));
            }
            chartVo.setAmountList(amountList);
            chartVo.setCountAmount(countAmount);
            chartVo.setCountList(countList);
            chartVo.setGroupNameList(groupNameList);
            chartVo.setTotalAmount(totalAmount);

        } else if (num == 1) {

            myTime = DayUtils.getYear();
            map.put("myTime", myTime);
            System.out.println("------------------->" + map.get("username") + "->" + map.get("myTime"));
            int countAmount = indexMapper.getCountAmount(map);
            System.out.println("countAmount----->" + countAmount);
            Float totalAmount = indexMapper.getTotalAmount(map);

            for (int i = 1; i <= 12; i++) {
                Calendar c = Calendar.getInstance();
                String month = null;
                if (i < 10) {
                    month = String.valueOf(c.get(c.YEAR)) + "-0" + i;
                } else {
                    month = String.valueOf(c.get(c.YEAR)) + "-" + i;
                }
                HashMap<String, String> yearMap = new HashMap<>();
                yearMap.put("username", users.getUsername());
//                yearMap.put("username","123");
                yearMap.put("month", month);
                groupNameList.add(StringUtils.DateManage(month));
                amountList.add(indexMapper.getMonthAmount(yearMap));
                countList.add(indexMapper.getMonthCount(yearMap));
            }

            chartVo.setAmountList(amountList);
            chartVo.setCountAmount(countAmount);
            chartVo.setCountList(countList);
            chartVo.setGroupNameList(groupNameList);
            chartVo.setTotalAmount(totalAmount);
        }
//        System.out.println(chartVo.getAmountList().get(0));
        System.out.println("chartVo--------->" + chartVo);
        return chartVo;
    }

    @Override
    public ChartVo getPurchaseChart(Integer purNum, Users user) {
        ChartVo chartVo = new ChartVo();
        List<Float> amountList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        List<String> groupNameList = new ArrayList<>();
        String myTime = null;

        HashMap<String, String> map = new HashMap<>();
        map.put("username", user.getUsername());
//        map.put("username","123");

        if (purNum == 0) {
            myTime = DayUtils.getMonth();
            map.put("myTime", myTime);
            int dayCount = 0;

            int countAmount = indexMapper.getPurCountAmount(map);
            Float totalAmount = indexMapper.getPurTotalAmount(map);


            for (int i = 0; i < TOTAL; i++) {


                String minDay = DayUtils.getDay(dayCount);
                dayCount += 3;
                if (dayCount > DayUtils.getMaxDay()) {
                    dayCount = DayUtils.getMaxDay();
                }

                String maxDay = DayUtils.getDay(dayCount);
                dayCount += 1;
                DayVo dayVo = new DayVo();
                dayVo.setMinDay(minDay);
                dayVo.setMaxDay(maxDay);
                dayVo.setUsername(user.getUsername());
//                dayVo.setUsername("123");


                groupNameList.add(StringUtils.DateManage(minDay) + "-" + StringUtils.DateManage(maxDay));
                amountList.add(indexMapper.getPurAmount(dayVo));
                countList.add(indexMapper.getPurCount(dayVo));
            }
            chartVo.setAmountList(amountList);
            chartVo.setCountAmount(countAmount);
            chartVo.setCountList(countList);
            chartVo.setGroupNameList(groupNameList);
            chartVo.setTotalAmount(totalAmount);

        } else if (purNum == 1) {
            myTime = DayUtils.getYear();
            map.put("myTime", myTime);
            int countAmount = indexMapper.getPurCountAmount(map);
            System.out.println("countAmount----->" + countAmount);
            Float totalAmount = indexMapper.getPurTotalAmount(map);

            for (int i = 1; i <= 12; i++) {
                Calendar c = Calendar.getInstance();
                String month = null;
                if (i < 10) {
                    month = String.valueOf(c.get(c.YEAR)) + "-0" + i;
                } else {
                    month = String.valueOf(c.get(c.YEAR)) + "-" + i;
                }
                HashMap<String, String> yearMap = new HashMap<>();
                yearMap.put("month", month);
                yearMap.put("username", user.getUsername());
//                yearMap.put("username","123");
                groupNameList.add(StringUtils.DateManage(month));
                amountList.add(indexMapper.getPurMonthAmount(yearMap));
                countList.add(indexMapper.getPurMonthCount(yearMap));
            }

            chartVo.setAmountList(amountList);
            chartVo.setCountAmount(countAmount);
            chartVo.setCountList(countList);
            chartVo.setGroupNameList(groupNameList);
            chartVo.setTotalAmount(totalAmount);
        }
//        System.out.println(chartVo.getAmountList().get(0));
        System.out.println("chartVo--------->" + chartVo);
        return chartVo;

    }
}
