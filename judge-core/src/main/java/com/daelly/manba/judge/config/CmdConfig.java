package com.daelly.manba.judge.config;

public class CmdConfig {

    public static final CmdConfig DEFAULT_CONFIG = new CmdConfig();

    private static final String DEFAULT_HOST_WORK_DIR = "";

    private static final String DEFAULT_VOLUMN_DIR = "";

    private String hostWorkDir = DEFAULT_HOST_WORK_DIR;

    private String volumnDir = DEFAULT_VOLUMN_DIR;

    public String getHostWorkDir() {
        return hostWorkDir;
    }

    public String getVolumnDir() {
        return volumnDir;
    }
}
