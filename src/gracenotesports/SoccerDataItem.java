/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gracenotesports;

/**
 *
 * @author ding
 */
public class SoccerDataItem {

    
    private String actionId;
    private String competition;
    private String matchId;
    private String date;
    private String action;
    private String period;
    private String startTime;
    private String endtime;
    private String homeOrAway;
    private String teamId;
    private String team;
    private String personId;
    private String person;
    private String function;
    private String shirtNr;
    private String actionReason;
    private String actionInfo;
    private String subpersonId;
    private String subperson;

    public SoccerDataItem(String actionId, String competition, String matchId, String date, String action, String period, String startTime, String endtime, String homeOrAway, String teamId, String team, String personId, String person, String function, String shirtNr, String actionReason, String actionInfo, String subpersonId, String subperson) {
        this.actionId = actionId;
        this.competition = competition;
        this.matchId = matchId;
        this.date = date;
        this.action = action;
        this.period = period;
        this.startTime = startTime;
        this.endtime = endtime;
        this.homeOrAway = homeOrAway;
        this.teamId = teamId;
        this.team = team;
        this.personId = personId;
        this.person = person;
        this.function = function;
        this.shirtNr = shirtNr;
        this.actionReason = actionReason;
        this.actionInfo = actionInfo;
        this.subpersonId = subpersonId;
        this.subperson = subperson;
    }
      
    /**
     * @return the actionId
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * @param actionId the actionId to set
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * @return the competition
     */
    public String getCompetition() {
        return competition;
    }

    /**
     * @param competition the competition to set
     */
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    /**
     * @return the matchId
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * @param matchId the matchId to set
     */
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endtime
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * @param endtime the endtime to set
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * @return the homeOrAway
     */
    public String getHomeOrAway() {
        return homeOrAway;
    }

    /**
     * @param homeOrAway the homeOrAway to set
     */
    public void setHomeOrAway(String homeOrAway) {
        this.homeOrAway = homeOrAway;
    }

    /**
     * @return the teamId
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * @param teamId the teamId to set
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the person
     */
    public String getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(String person) {
        this.person = person;
    }

    /**
     * @return the function
     */
    public String getFunction() {
        return function;
    }

    /**
     * @param function the function to set
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * @return the shirtNr
     */
    public String getShirtNr() {
        return shirtNr;
    }

    /**
     * @param shirtNr the shirtNr to set
     */
    public void setShirtNr(String shirtNr) {
        this.shirtNr = shirtNr;
    }

    /**
     * @return the actionReason
     */
    public String getActionReason() {
        return actionReason;
    }

    /**
     * @param actionReason the actionReason to set
     */
    public void setActionReason(String actionReason) {
        this.actionReason = actionReason;
    }

    /**
     * @return the actionInfo
     */
    public String getActionInfo() {
        return actionInfo;
    }

    /**
     * @param actionInfo the actionInfo to set
     */
    public void setActionInfo(String actionInfo) {
        this.actionInfo = actionInfo;
    }

    /**
     * @return the subpersonId
     */
    public String getSubpersonId() {
        return subpersonId;
    }

    /**
     * @param subpersonId the subpersonId to set
     */
    public void setSubpersonId(String subpersonId) {
        this.subpersonId = subpersonId;
    }

    /**
     * @return the subperson
     */
    public String getSubperson() {
        return subperson;
    }

    /**
     * @param subperson the subperson to set
     */
    public void setSubperson(String subperson) {
        this.subperson = subperson;
    }

    @Override
    public String toString() {
        return "Data{" + "actionId=" + actionId + ", competition=" + competition + ", matchId=" + matchId + ", date=" + date + ", action=" + action + ", period=" + period + ", startTime=" + startTime + ", endtime=" + endtime + ", homeOrAway=" + homeOrAway + ", teamId=" + teamId + ", team=" + team + ", personId=" + personId + ", person=" + person + ", function=" + function + ", shirtNr=" + shirtNr + ", actionReason=" + actionReason + ", actionInfo=" + actionInfo + ", subpersonId=" + subpersonId + ", subperson=" + subperson + '}';
    }

   
}
