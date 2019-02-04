package com.plan.logger.classic.encoder;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import com.plan.logger.classic.XXPatternLayout;

public class XXPatternLayoutEncoder extends PatternLayoutEncoder {
    public XXPatternLayoutEncoder() {
    }

    public void start() {
        XXPatternLayout xXPatternLayout = new XXPatternLayout();
        xXPatternLayout.setContext(this.context);
        xXPatternLayout.setPattern(this.getPattern());
        xXPatternLayout.setOutputPatternAsHeader(this.outputPatternAsHeader);
        xXPatternLayout.start();
        this.layout = xXPatternLayout;
        super.start();
    }
}
