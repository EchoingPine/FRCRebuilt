package frc.robot.commands.intake;

import frc.robot.subsystems.Intake;
import frc.robot.testingdashboard.Command;

public class DeployerIn extends Command {
    private final Intake m_Intake;

    public DeployerIn() {
        super(Intake.getInstance(), "Deployer", "DeployerIn");

        m_Intake = Intake.getInstance();

        addRequirements(m_Intake);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_Intake.retract(0.5);
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
