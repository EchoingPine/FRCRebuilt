package frc.robot.commands.intake;

import frc.robot.subsystems.Intake;
import frc.robot.testingdashboard.Command;

public class DeployerOut extends Command {
    private final Intake m_Intake;

    public DeployerOut() {
        super(Intake.getInstance(), "Deployer", "DeployerOut");

        m_Intake = Intake.getInstance();

        addRequirements(m_Intake);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_Intake.deploy(0.5);
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
