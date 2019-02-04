package com.plan.logger.classic.pattern;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.util.UUID;

public class TraceConverter extends ClassicConverter {
    private String defValue = "";
    public TraceConverter() {
    }

    public void start() {
        defValue = ("xx"+UUID.randomUUID()).replaceAll("-", "");
    }

    public void stop() {
        defValue = null;
    }

    @Override
    public String convert(ILoggingEvent event) {
        return "traceId:"+defValue;
    }
}
