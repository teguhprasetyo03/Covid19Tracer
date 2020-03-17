package com.studiomasteguh.tracercovid19.ui.country;

public class CovidCountry {

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public void setmCovidCountry(String mCovidCountry) {
        this.mCovidCountry = mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }

    public void setmCases(String mCases) {
        this.mCases = mCases;
    }

    public String getmDeadths() {
        return mDeadths;
    }

    public void setmDeadths(String mDeadths) {
        this.mDeadths = mDeadths;
    }

    public String getmTodayCases() {
        return mTodayCases;
    }

    public void setmTodayCases(String mTodayCases) {
        this.mTodayCases = mTodayCases;
    }

    public String getmTodayDeadths() {
        return mTodayDeadths;
    }

    public void setmTodayDeadths(String mTodayDeadths) {
        this.mTodayDeadths = mTodayDeadths;
    }

    public String getmRecovered() {
        return mRecovered;
    }

    public void setmRecovered(String mRecovered) {
        this.mRecovered = mRecovered;
    }

    public String getmCritical() {
        return mCritical;
    }

    public void setmCritical(String mCritical) {
        this.mCritical = mCritical;
    }

    public CovidCountry(String mCovidCountry, String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mDeadths = mDeadths;
        this.mTodayCases = mTodayCases;
        this.mTodayDeadths = mTodayDeadths;
        this.mRecovered = mRecovered;
        this.mCritical = mCritical;
    }

    String mCovidCountry, mCases , mDeadths, mTodayCases, mTodayDeadths , mRecovered, mCritical;
}
