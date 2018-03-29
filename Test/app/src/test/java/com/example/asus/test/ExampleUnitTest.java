package com.example.asus.test;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleUnitTest {
    @Before
    public void before() throws Exception{
        System.out.println("before");
    }
    @Test
    public void addition_isCorrect() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("a","hello");
        map.put("b","world");
        map.put("a","he");
        assertThat(map,hasEntry("a","hello"));
        assertThat(map,hasKey("b"));
        assertThat(map,hasEntry("a","he"));

        /*
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertThat(list,hasItem("a"));
        assertThat(list,hasItems("b","c"));
        String[]array = new String[]{"a","b","c","d"};
        assertThat(array,hasItemInArray("b"));

        assertThat(new Object(),notNullValue());
        Object obj = null;
        assertThat(obj,nullValue());
        String str = null;
        assertThat(str,nullValue(String.class));
        */
    }

    @After
    public void after() throws Exception{
        System.out.println("after");
    }

}