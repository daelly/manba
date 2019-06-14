package com.daelly.manba.judge.compiler;

import com.daelly.manba.judge.config.CmdConfig;
import com.daelly.manba.judge.config.CmdConfigurable;
import com.daelly.manba.judge.core.CompileResult;
import com.daelly.manba.judge.core.Compiler;
import com.daelly.manba.judge.core.Source;
import com.daelly.manba.judge.utils.UniqueNameGenerator;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class JavaCompiler implements Compiler, CmdConfigurable {

    private static final Logger logger = LoggerFactory.getLogger(JavaCompiler.class);

    private final CmdConfig config;

    public JavaCompiler() {
        this(CmdConfig.DEFAULT_CONFIG);
    }

    public JavaCompiler(CmdConfig config) {
        this.config = config;
    }

    @Override
    public CompileResult compile(Source source) {
        String folder = UniqueNameGenerator.gen(16);
        String sourcePath = config.getHostWorkDir() + folder;
        String volumnPath = config.getVolumnDir() + folder;
        try {
            FileUtils.write(new File(sourcePath + "Main.java"), source.getSource(), "UTF-8");
        } catch (IOException e) {
            logger.error("", e);
        }

        try {
            Process process = Runtime.getRuntime().exec("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public CmdConfig getConfig() {
        return config;
    }
}
