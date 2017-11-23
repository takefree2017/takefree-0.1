package com.takefree.common.entry;

/**
 * Created by gaoxiang on 2017/7/11.
 */
public class ResultView {
    /**
     * use in success views
     */
    public interface ResultDataView {} ;

    public interface BriefView extends ResultDataView {};

    public interface DetailView extends BriefView {}

    public interface UserFollowerView extends BriefView {}

    public interface AllView extends DetailView {}
}
