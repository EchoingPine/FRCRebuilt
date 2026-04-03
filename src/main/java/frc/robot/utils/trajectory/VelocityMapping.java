package frc.robot.utils.trajectory;

import edu.wpi.first.math.MathUtil;

public class VelocityMapping {
    public double velocity1, velocity2;
    public double rpm1, rpm2;

    public VelocityMapping(double velocity1, double velocity2, double rpm1, double rpm2) {
        this.velocity1 = velocity1;
        this.velocity2 = velocity2;
        this.rpm1 = rpm1;
        this.rpm2 = rpm2;
    }

    public VelocityMapping() {
        this.velocity1 = 0;
        this.velocity2 = 0;
        this.rpm1 = 0;
        this.rpm2 = 0;
    }

    public double getRPM(double velocity) {
        return MathUtil.interpolate(rpm1, rpm2, MathUtil.inverseInterpolate(velocity1, velocity2, velocity));
    }

    public double getVelocity(double rpm) {
        return MathUtil.interpolate(velocity1, velocity2, MathUtil.inverseInterpolate(rpm1, rpm2, rpm));
    }

    public static VelocityMapping interpolate(VelocityMapping a, VelocityMapping b, double t) {
        VelocityMapping r = new VelocityMapping();
        r.velocity1 = MathUtil.interpolate(a.velocity1, b.velocity1, t);
        r.velocity2 = MathUtil.interpolate(a.velocity2, b.velocity2, t);
        r.rpm1 = MathUtil.interpolate(a.rpm1, b.rpm1, t);
        r.rpm2 = MathUtil.interpolate(a.rpm2, b.rpm2, t);
        return r;
    }
}