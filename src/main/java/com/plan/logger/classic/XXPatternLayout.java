package com.plan.logger.classic;

import ch.qos.logback.classic.PatternLayout;
import com.plan.logger.classic.pattern.TraceConverter;

public class XXPatternLayout extends PatternLayout {

    static {
        defaultConverterMap.put("trace", TraceConverter.class.getName());

    }
}
