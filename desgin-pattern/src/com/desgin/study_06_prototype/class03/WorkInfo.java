package com.desgin.study_06_prototype.class03;

import java.io.Serializable;

/**
 * @author test_jia
 * ClassName WorkInfo
 * PackageName com.desgin.study_06_prototype.class02
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午11:15
 */
public class WorkInfo implements Cloneable, Serializable {
    private String company;
    private String workDate;

    public WorkInfo() {
    }

    public WorkInfo(String company, String workDate) {
        this.company = company;
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "WorkInfo{" +
                "company='" + company + '\'' +
                ", workDate='" + workDate + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
