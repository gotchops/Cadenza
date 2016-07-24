package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * Controller class for the note identification tab.
 * Associated FXML file: notes_pane.fxml
 */
public class NotesController {	
	private ImagePath.note m_currentNote;
	
	@FXML
	private Button cSharpBtn;
	@FXML
	private Button dSharpBtn;
	@FXML
	private Button eSharpBtn;
	@FXML
	private Button fSharpBtn;
	@FXML
	private Button gSharpBtn;
	@FXML
	private Button aSharpBtn;
	@FXML
	private Button bSharpBtn;
	
	@FXML
	private Button cBtn;
	@FXML
	private Button dBtn;
	@FXML
	private Button eBtn;
	@FXML
	private Button fBtn;
	@FXML
	private Button gBtn;
	@FXML
	private Button aBtn;
	@FXML
	private Button bBtn;
	
	@FXML
	private Button cFlatBtn;
	@FXML
	private Button dFlatBtn;
	@FXML
	private Button eFlatBtn;
	@FXML
	private Button fFlatBtn;
	@FXML
	private Button gFlatBtn;
	@FXML
	private Button aFlatBtn;
	@FXML
	private Button bFlatBtn;
	
	@FXML
	private ImageView notesImg;
	
	@FXML
	public void initialize() {
		m_currentNote = ImagePath.setRandomNoteImage(notesImg);
		
		// On a button press, check if the user got the correct answer.
		// If they did, then show a new image. If they didn't, show a dialog.
		java.util.function.Consumer<ActionEvent> noteButtonPressed =
				 (ActionEvent event) -> {
			Button btn = (Button) event.getSource();
			String btnId = btn.getId();
			switch(btnId) {
			case "cSharpBtn":
				if (m_currentNote == ImagePath.note.CSHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "dSharpBtn":
				if (m_currentNote == ImagePath.note.DSHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "eSharpBtn":
				if (m_currentNote == ImagePath.note.ESHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "fSharpBtn":
				if (m_currentNote == ImagePath.note.FSHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "gSharpBtn":
				if (m_currentNote == ImagePath.note.GSHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "aSharpBtn":
				if (m_currentNote == ImagePath.note.ASHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "bSharpBtn":
				if (m_currentNote == ImagePath.note.BSHARP) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "cBtn":
				if (m_currentNote == ImagePath.note.C) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "dBtn":
				if (m_currentNote == ImagePath.note.D) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "eBtn":
				if (m_currentNote == ImagePath.note.E) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "fBtn":
				if (m_currentNote == ImagePath.note.F) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "gBtn":
				if (m_currentNote == ImagePath.note.G) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "aBtn":
				if (m_currentNote == ImagePath.note.A) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "bBtn":
				if (m_currentNote == ImagePath.note.B) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "cFlatBtn":
				if (m_currentNote == ImagePath.note.CFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "dFlatBtn":
				if (m_currentNote == ImagePath.note.DFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "eFlatBtn":
				if (m_currentNote == ImagePath.note.EFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "fFlatBtn":
				if (m_currentNote == ImagePath.note.FFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "gFlatBtn":
				if (m_currentNote == ImagePath.note.GFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "aFlatBtn":
				if (m_currentNote == ImagePath.note.AFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
				break;
			case "bFlatBtn":
				if (m_currentNote == ImagePath.note.BFLAT) {
					m_currentNote = ImagePath.setRandomNoteImage(notesImg);
				} else {
					showIncorrectDialog();
				}
					break;
			default:
				break;
			}
		};
		
		cSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		dSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		eSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		fSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		gSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		aSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		bSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		cBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		dBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		eBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		fBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		gBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		aBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		bBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		cFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		dFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		eFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		fFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		gFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		aFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		bFlatBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
	}
	
	private void showIncorrectDialog() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Incorrect. Try again.");
		alert.showAndWait();
	}
}
