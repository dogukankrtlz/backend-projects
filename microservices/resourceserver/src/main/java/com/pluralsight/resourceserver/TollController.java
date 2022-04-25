package com.pluralsight.resourceserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TollController {


    private List<TollData> tollDataList;
    public TollController(){
        tollDataList = new ArrayList<TollData>();

        tollDataList.add(new TollData("900","1VB4GHA","2022-03-23-2022T21:22:10"));
        tollDataList.add(new TollData("901","BB40031","2022-03-23-2022T21:22:20"));
        tollDataList.add(new TollData("902","B200VV7","2022-03-23-2022T21:22:55"));


    }


    @RequestMapping("/api/tolldata")
    public List<TollData> getTollDataList() {
        return tollDataList;
    }

    @RequestMapping("/api/string")
    public String getString(){
        return "I am the string";
    }



}
