package frc.robot.auto.actions;

import frc.robot.lib.util.DataLogger;
import frc.robot.command_status.DriveState;
import frc.robot.subsystems.*;

import frc.robot.subsystems.Superstructure;
import frc.robot.HatchDeploy;
import frc.robot.Robot;

/**
 * DriveStraightAction drives the robot straight at a settable angle, distance,
 * and velocity. This action begins by setting the drive controller, and then
 * waits until the distance is reached.
 *
 * @see Action
 * @see Drive
 * @see Rotation2d
 */
public class DeployHatchAction implements Action {

    HatchDeploy hatchDeploy = HatchDeploy.getInstance();

    private boolean finished;
  

    public DeployHatchAction() {
        finished = false;

    }

    @Override
	public void start() 
	{
System.out.println("Starting DeployHatchAction");		
		boolean extended = true;
        hatchDeploy.deploy(); 
        finished = true;
	}

	@Override
	public boolean isFinished() {
		return finished;
	}

	@Override
	public void update() {}

	@Override
	public void done() {
System.out.println("Done DeployHatchAction");		

	}

	private final DataLogger logger = new DataLogger()
    {
        @Override
        public void log()
        {
	    }
    };
	
	@Override
	public DataLogger getLogger() { return logger; }

}
