// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.*;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


    public class SN_Extreme3DStick extends Joystick {
        public Button btn_1 = new JoystickButton(this, 1);
        public Button btn_2 = new JoystickButton(this, 2);
        public Button btn_3 = new JoystickButton(this, 3);
        public Button btn_4 = new JoystickButton(this, 4);
        public Button btn_5 = new JoystickButton(this, 5);
        public Button btn_6 = new JoystickButton(this, 6);
        public Button btn_7 = new JoystickButton(this, 7);
        public Button btn_8 = new JoystickButton(this, 8);
        public Button btn_9 = new JoystickButton(this, 9);
        public Button btn_10 = new JoystickButton(this, 10);
        public Button btn_11 = new JoystickButton(this, 11);
        public Button btn_12 = new JoystickButton(this, 12);
    
            
        private static final int AXIS_X = 0;
        private static final int AXIS_Y = 1;
        private static final int AXIS_TWIST = 2;
        private static final int AXIS_DIAL = 3;
    
        /**
         * Logitech Extreme 3D Pro Joystick with 12 buttons
         *
         * @param port The port on the Driver Station that the joystick is plugged into.
         */
        public SN_Extreme3DStick(final int port) {
            super(port);
        }
    
        /**
         * @return position value of RawAxis({@value #AXIS_X})
         */
        public double getXAxis() {
            return getRawAxis(AXIS_X);
        }
    
        /**
         * @return inverted position value of RawAxis({@value #AXIS_Y})
         */
        public double getYAxis() {
            return -getRawAxis(AXIS_Y);
        }
    
        /**
         * @return position Value of RawAxis({@value #AXIS_TWIST})
         */
        public double getTwistAxis() {
            return getRawAxis(AXIS_TWIST);
        }
    
        /**
         * @return inverted position value of RawAxis({@value #AXIS_DIAL})
         */
        public double getDialAxis() {
            return (((getRawAxis(AXIS_DIAL) * -1) + 1) / 2);
        }
    
        /**
         * @param axisId id number of controller axis, viewable in this file if needed
         * @return position value of RawAxis(axisId)
         */
        public double getAxisVar(int axisId) {
            return getRawAxis(axisId);
        }
     
    }
}