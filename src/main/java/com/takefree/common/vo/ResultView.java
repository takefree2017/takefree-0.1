package com.takefree.common.vo;

/**
 * Created by gaoxiang on 2017/7/11.
 */
public class ResultView {
    /**
     * use in error views
     */
    public interface ResultStatusView{};

    /**
     * use in success views
     */
    public interface ResultDataView extends ResultStatusView{} ;
}
