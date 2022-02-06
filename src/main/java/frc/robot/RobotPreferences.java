// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import Preferences.SN_DoublePreference;
import Preferences.SN_IntPreference;

/** Add your docs here. */
public class RobotPreferences {

    public static final SN_DoublePreference lfdP = new SN_DoublePreference("lfdP", .002);
    public static final SN_DoublePreference lfdI = new SN_DoublePreference("lfdI", 0);
    public static final SN_DoublePreference lfdD = new SN_DoublePreference("lfdD", 0);
    public static final SN_DoublePreference lfdFF = new SN_DoublePreference("lfdFF", 2.4E-4);
    public static final SN_DoublePreference lfsP = new SN_DoublePreference("lfsP", .002);
    public static final SN_DoublePreference lfsI = new SN_DoublePreference("lfsI", 0);
    public static final SN_DoublePreference lfsD = new SN_DoublePreference("lfsD", 0);
    public static final SN_DoublePreference lfsFF = new SN_DoublePreference("lfsFF", 2.4E-4);
}

