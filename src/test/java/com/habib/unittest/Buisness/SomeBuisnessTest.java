package com.habib.unittest.Buisness;

import com.habib.unittest.BuisnessImp.DataService;
import com.habib.unittest.BuisnessImp.SomeBuisnessImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//class Simpledata implements DataService{
//
//    @Override
//    public int[] getdata() {
//        return new int[]{1,2,4,5};
//    }
//}

@RunWith(MockitoJUnitRunner.class)
public class SomeBuisnessTest {
    @InjectMocks
    SomeBuisnessImpl buisness;
    @Mock
    DataService mocDataService;

//    @Before
//    public void before(){
//        buisness.setDataService(mocDataService);
//    }


    @Test
    public void sumTestWithMokito() {

        when(mocDataService.getdata()).thenReturn(new int[]{1,2,3,4,5});
        assertEquals(15,buisness.calculateSum());

    }
    @Test
    public void sumEmptyTestWithMokito() {

        when(mocDataService.getdata()).thenReturn(new int[]{});
        assertEquals(0,buisness.calculateSum());

    }
    @Test
    public void sumOneTestWithMokito() {

        when(mocDataService.getdata()).thenReturn(new int[]{5});
        assertEquals(5,buisness.calculateSum());

    }

    //    @Test
//    public void sumWithDataService() {
//        SomeBuisnessImpl buisness = new SomeBuisnessImpl();
//        buisness.setDataService(new Simpledata());
//        int result = buisness.calculateSum();
//        assertEquals(12,result);
//    }
    //simple junit test
//    @Test
//    public void calculateSum_basic(){
//
//        SomeBuisnessImpl buisness = new SomeBuisnessImpl();
//        int result = buisness.calculateSum(new int[] {1,2,3});
//        assertEquals(6,result);
//
//    }
//    @Test
//    public void calculateSum_empty(){
//
//        SomeBuisnessImpl buisness = new SomeBuisnessImpl();
//        int result = buisness.calculateSum(new int[] {});
//        assertEquals(0,result);
//
//    }
//    @Test
//    public void calculateSum_one(){
//
//        SomeBuisnessImpl buisness = new SomeBuisnessImpl();
//        int result = buisness.calculateSum(new int[] {1});
//        assertEquals(1,result);
//
//    }
}
