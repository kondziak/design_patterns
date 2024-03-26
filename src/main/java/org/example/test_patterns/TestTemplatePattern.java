package org.example.test_patterns;

import org.example.template_pattern.MyDay;
import org.example.template_pattern.TransportType;

public class TestTemplatePattern {

    public static void testTemplatePattern() {
        MyDay myDay = new MyDay();
        myDay.everyDayIsExactlyTheSame(TransportType.BIKE);
    }
}
