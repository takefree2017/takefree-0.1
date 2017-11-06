package com.takefree.common;

/**
 * Created by gaoxiang on 2017/11/6.
 */
public class MyJsonView {
    public interface BriefView {}
    public interface DetailView extends BriefView{}
    public interface AllView extends DetailView{}
}
