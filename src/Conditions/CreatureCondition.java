package Conditions;

public class CreatureCondition {
    private String conditionName;
    private String conditionDesc;
    private String conditionIconPath;

    public CreatureCondition() {
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getConditionDesc() {
        return conditionDesc;
    }

    public void setConditionDesc(String conditionDesc) {
        this.conditionDesc = conditionDesc;
    }

    public String getConditionIconPath() {
        return conditionIconPath;
    }

    public void setConditionIconPath(String conditionIconPath) {
        this.conditionIconPath = conditionIconPath;
    }
}
