package com.habib.unittest.BuisnessImp;

public class SomeBuisnessImpl {

   DataService dataService;

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public int calculateSum(){
        int sum = 0;
        int [] data = dataService.getdata();
        for (int value:data){
            sum = sum +value;
        }
        return sum;
    }


}
