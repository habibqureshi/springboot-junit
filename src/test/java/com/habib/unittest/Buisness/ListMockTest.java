package com.habib.unittest.Buisness;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListMockTest {
    List mock = mock(List.class);




    @Test
    public void basic(){
        when(mock.size()).thenReturn(3);
        assertEquals(3,mock.size());

    }

    @Test
    public void differentValue(){
        when(mock.size()).thenReturn(3).thenReturn(4);
        assertEquals(3,mock.size());
        assertEquals(4,mock.size());


    }
    @Test
    public void differentValueArgument(){
        when(mock.get(0)).thenReturn("testing");
        assertEquals("testing",mock.get(0));
//        assertEquals(4,mock.get(1));


    }
}
