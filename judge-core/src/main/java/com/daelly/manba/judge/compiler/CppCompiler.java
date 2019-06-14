package com.daelly.manba.judge.compiler;

import com.daelly.manba.judge.config.CmdConfig;
import com.daelly.manba.judge.config.CmdConfigurable;
import com.daelly.manba.judge.core.CompileResult;
import com.daelly.manba.judge.core.Compiler;
import com.daelly.manba.judge.core.Source;

public class CppCompiler implements Compiler, CmdConfigurable {

    @Override
    public CompileResult compile(Source source) {
        return null;
    }

    @Override
    public CmdConfig getConfig() {
        return null;
    }
}
