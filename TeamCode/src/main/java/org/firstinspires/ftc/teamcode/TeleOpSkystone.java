package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "Driving time", group = "EAP")
public class TeleOpSkystone extends LinearOpMode {

    private DcMotor LeftA;
    private DcMotor LeftB;
    private DcMotor RightA;
    private DcMotor RightB;

    @Override
    public void runOpMode () throws InterruptedException{

        LeftA = hardwareMap.dcMotor.get("LeftA");
        System.out.println("LeftA Initialized");
        LeftB = hardwareMap.dcMotor.get("LeftB");
        System.out.println("LeftB Initialized");
        RightA = hardwareMap.dcMotor.get("RightA");
        System.out.println("RightA Initialized");
        RightB  =hardwareMap.dcMotor.get("RightB");
        System.out.println("RightB Initialized");

        LeftA.setDirection(DcMotorSimple.Direction.REVERSE);
        LeftB.setDirection(DcMotorSimple.Direction.REVERSE);
        System.out.println("Left drive train set");
        System.out.println("Robot ready");
        System.out.println("Awaiting start");

        waitForStart();

        while(opModeIsActive()){
//front and back
            LeftA.setPower(-gamepad1.left_stick_y);
            LeftB.setPower(-gamepad1.left_stick_y);
            RightA.setPower(-gamepad1.left_stick_y);
            RightB.setPower(-gamepad1.left_stick_y);

//side to side
            LeftA.setPower(-gamepad1.left_stick_x);
            LeftB.setPower(gamepad1.left_stick_x);
            RightA.setPower(gamepad1.left_stick_x);
            RightB.setPower(-gamepad1.left_stick_x);
//rotation
            LeftA.setPower(-gamepad1.right_stick_x);
            LeftB.setPower(-gamepad1.right_stick_x);
            RightA.setPower(gamepad1.right_stick_x);
            RightB.setPower(gamepad1.right_stick_x);



         idle();
        }

    }

}







