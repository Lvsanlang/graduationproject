package com.student.graduationproject.model.number8data;

public class Number8data {
    private String teamAbbreviation;

    private Double netRating;

    private Float orebPct;

    private Float drebPct;

    private Float usgPct;

    private Float tsPct;

    private Float astPct;

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation == null ? null : teamAbbreviation.trim();
    }

    public Double getNetRating() {
        return netRating;
    }

    public void setNetRating(Double netRating) {
        this.netRating = netRating;
    }

    public Float getOrebPct() {
        return orebPct;
    }

    public void setOrebPct(Float orebPct) {
        this.orebPct = orebPct;
    }

    public Float getDrebPct() {
        return drebPct;
    }

    public void setDrebPct(Float drebPct) {
        this.drebPct = drebPct;
    }

    public Float getUsgPct() {
        return usgPct;
    }

    public void setUsgPct(Float usgPct) {
        this.usgPct = usgPct;
    }

    public Float getTsPct() {
        return tsPct;
    }

    public void setTsPct(Float tsPct) {
        this.tsPct = tsPct;
    }

    public Float getAstPct() {
        return astPct;
    }

    public void setAstPct(Float astPct) {
        this.astPct = astPct;
    }
}