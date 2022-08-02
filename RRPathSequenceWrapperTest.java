package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.auto.roadrunner.wrapper.RoadrunnerUnit;
import org.firstinspires.ftc.teamcode.auto.roadrunner.wrapper.RoadrunnerWrapper;
import org.firstinspires.ftc.teamcode.auto.roadrunner.wrapper.RobotCommon;
import org.firstinspires.ftc.teamcode.auto.roadrunner.wrapper.SequenceWrapper;
import org.firstinspires.ftc.teamcode.auto.roadrunner.wrapper.WrapperBuilder;

@Autonomous(name="RRPathSequenceWrapperTest")
public class RRPathSequenceWrapperTest extends RobotCommon {

    /**
     * Override this method and place your code here.
     * <p>
     * Please do not swallow the InterruptedException, as it is used in cases
     * where the op mode needs to be terminated early.
     *
     * @throws InterruptedException
     */
    @Override
    public void runOpMode() throws InterruptedException {
        pathing = new RoadrunnerWrapper(hardwareMap, RoadrunnerUnit.CM);
        pathing.sequenceWrapper = new SequenceWrapper(new WrapperBuilder(pathing)
                .lineToLinearHeading(50, 20, 90)
                .strafeLeft(10)
                .forward(10)
                .lineToSplineHeading(50, 20, 0)
        );
        initialize();

        run();
    }
}
