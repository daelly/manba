package com.daelly.manba.judge.core;

final public class Source {
    final Language language;

    final String source;

    final Boolean requireCompile;

    String runnable;

    public Source(Language language, String source, Boolean requireCompile) {
        this.language = language;
        this.source = source;
        this.requireCompile = requireCompile;
    }

    public void setRunnable(String runnable) {
        this.runnable = runnable;
    }

    public Language getLanguage() {
        return language;
    }

    public String getSource() {
        return source;
    }

    public Boolean getRequireCompile() {
        return requireCompile;
    }

    public String getRunnable() {
        return runnable;
    }
}
