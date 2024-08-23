import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:/Users/Win1/Videos/p pr/Adobe Premiere Pro Captured Audio/ums/Audio 1.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		String Response = "";
		while(!Response.equals("Q")) {
			System.out.println("P:Play  S:Stop  R:Restart  Q:Quit");
			System.out.print("Enter you Choice: ");
			Response =sc.next();
			Response.toUpperCase();
			
			switch(Response) {
			case ("P"): clip.start();
			break;
			case ("S"): clip.stop();
			break;
			case ("R"): clip.setMicrosecondPosition(0);
			break;
			case ("Q"): clip.close();
			break;
			}
		}
	}

}
