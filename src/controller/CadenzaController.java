package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;

/**
 * Controller class for cadenza.fxml: what the user sees on start up
 *
 */
public class CadenzaController {
	
	@FXML
	private Tab notesTab;
	@FXML
	private Tab keySigsTab;
	@FXML
	private Tab keyboardTab;
	
	private final String notesFXML = "/view/notes_pane.fxml";
	private final String keySigsFXML = "/view/key_sigs_pane.fxml";
	private final String keyboardFXML = "/view/keyboard_pane.fxml";

	@FXML
	public void initialize() {
		try {
			FXMLLoader notesPaneLoader = new FXMLLoader(getClass().getResource(notesFXML));
			FXMLLoader keySigsPaneLoader = new FXMLLoader(getClass().getResource(keySigsFXML));
			FXMLLoader keyboardPaneLoader = new FXMLLoader(getClass().getResource(keyboardFXML));
			
			Node notesPane = notesPaneLoader.load();
			Node keySigsPane = keySigsPaneLoader.load();
			Node keyboardPane = keyboardPaneLoader.load();
			
			notesTab.setContent(notesPane);
			keySigsTab.setContent(keySigsPane);
			keyboardTab.setContent(keyboardPane);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
