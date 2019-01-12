package co.com.accenture.automation.screenplaychallenge.utils;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotToLoadfiles {

	private final static String PATH_OF_THE_LOCAL_FILE = "C:\\Users\\michael.bedoya.cano\\eclipse-workspace\\BaseParaAutomatizacion\\ImagenesParaAdjuntar\\";

	public void processTheFile(String completedFilePath) throws IOException, AWTException, InterruptedException {

		if (completedFilePath.isEmpty() || completedFilePath.equals("") || completedFilePath == null) {
			uploadFile(PATH_OF_THE_LOCAL_FILE);
		} else {
			uploadFile(completedFilePath);
		}

		Thread.sleep(2000);
	}

	public void processTheFile(String filePath, String fileName, String fileExtension)
			throws IOException, AWTException, InterruptedException {

		String fileToUpload;

		fileToUpload = fileName + "." + fileExtension;

		uploadFile(filePath + "\\" + fileToUpload);
		Thread.sleep(2000);

	}

	/**
	 * This method copy in the clipboard whatever string that receive as a parameter
	 */
	public static void copyDataToClipbpard(String copiedData) {
		// StringSelection is foy copy and paste data
		StringSelection stringSelection = new StringSelection(copiedData);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void uploadFile(String fileLocation) {
		try {
			// Setup the clipboard with the file path
			copyDataToClipbpard(fileLocation);
			// Pressing the keys CTRL, V y ENTER
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
