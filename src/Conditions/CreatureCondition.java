package Conditions;

/**
 * A creature condition is an additional effect a creature can get.
 */

import lombok.Getter;

@Getter
public class CreatureCondition {
    private String conditionName;
    private String conditionDesc;
    private String conditionIconPath;
}
