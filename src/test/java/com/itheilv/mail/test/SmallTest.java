package com.itheilv.mail.test;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author WSQ
 * @since 2020-10-20
 */
public class SmallTest {

    @Test
    public void testNull() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "夏季");
        map.put("2", "东季");
        map.put("3", "春季");
        final List<String> result = Stream.of("4".split(",")).map(map::get).filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(result);
    }
}
