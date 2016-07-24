package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

/**
 * Controller class for the key signature identification tab
 * Associated FXML file: key_sigs_pane.fxml.
 */
public class KeySignaturesController {
	private boolean m_inMajorKeys = true;
	private ImagePath.key m_currentKey;

	@FXML
	private RadioButton majRadioBtn;
	@FXML
	private RadioButton minRadioBtn;
	
	@FXML
	private Button cSharpBtn;
	@FXML
	private Button fSharpBtn;
	
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
	private Button gFlatBtn;
	@FXML
	private Button aFlatBtn;
	@FXML
	private Button bFlatBtn;
	
	@FXML
	private ImageView keysImg;
	
	@FXML
	public void initialize() {
		m_currentKey = ImagePath.setRandomKeyImage(keysImg);
		
		final ToggleGroup group = new ToggleGroup();
		majRadioBtn.setToggleGroup(group);
		minRadioBtn.setToggleGroup(group);
		majRadioBtn.setSelected(true);
		
		// set radio button toggle for choosing between major and 
		// minor keys.
		majRadioBtn.setUserData("major");
		minRadioBtn.setUserData("minor");
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
		    @Override
			public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
		    	 String keyType;
		         if (group.getSelectedToggle() != null) {
		             keyType = group.getSelectedToggle().getUserData().toString();
		             if (keyType.equals("major")) {
		            	 m_inMajorKeys = true;
		             } else {
		            	 m_inMajorKeys = false;
		             }
		         }

		     }
		});
		
		// If the pressed button is the correct answer, show 
		// a new image. If it isn't, show a dialog.
		java.util.function.Consumer<ActionEvent> noteButtonPressed =
				 (ActionEvent event) -> {
			Button btn = (Button) event.getSource();
			String btnId = btn.getId();
			
			if (m_inMajorKeys) {
				switch(btnId) {
				case "cSharpBtn":
					if (m_currentKey == ImagePath.key.CSHARP_ASHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "fSharpBtn":
					if (m_currentKey == ImagePath.key.FSHARP_DSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "cBtn":
					if (m_currentKey == ImagePath.key.C_A) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "dBtn":
					if (m_currentKey == ImagePath.key.D_B) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "eBtn":
					if (m_currentKey == ImagePath.key.E_CSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "fBtn":
					if (m_currentKey == ImagePath.key.F_D) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "gBtn":
					if (m_currentKey == ImagePath.key.G_E) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "aBtn":
					if (m_currentKey == ImagePath.key.A_FSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "bBtn":
					if (m_currentKey == ImagePath.key.B_GSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "cFlatBtn":
					if (m_currentKey == ImagePath.key.CFLAT_AFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "dFlatBtn":
					if (m_currentKey == ImagePath.key.DFLAT_BFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "eFlatBtn":
					if (m_currentKey == ImagePath.key.EFLAT_C) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "gFlatBtn":
					if (m_currentKey == ImagePath.key.GFLAT_EFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "aFlatBtn":
					if (m_currentKey == ImagePath.key.AFLAT_F) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "bFlatBtn":
					if (m_currentKey == ImagePath.key.BFLAT_G) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
						break;
				default:
					break;
				}
			} else {
				switch(btnId) {
				case "cSharpBtn":
					if (m_currentKey == ImagePath.key.E_CSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "fSharpBtn":
					if (m_currentKey == ImagePath.key.A_FSHARP) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "cBtn":
					if (m_currentKey == ImagePath.key.EFLAT_C) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "dBtn":
					if (m_currentKey == ImagePath.key.F_D) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "eBtn":
					if (m_currentKey == ImagePath.key.G_E) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "fBtn":
					if (m_currentKey == ImagePath.key.AFLAT_F) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "gBtn":
					if (m_currentKey == ImagePath.key.BFLAT_G) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "aBtn":
					if (m_currentKey == ImagePath.key.C_A) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "bBtn":
					if (m_currentKey == ImagePath.key.D_B) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "cFlatBtn":
					showIncorrectDialog();
					break;
				case "dFlatBtn":
					showIncorrectDialog();
					break;
				case "eFlatBtn":
					if (m_currentKey == ImagePath.key.GFLAT_EFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "gFlatBtn":
					showIncorrectDialog();
					break;
				case "aFlatBtn":
					if (m_currentKey == ImagePath.key.CFLAT_AFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
					break;
				case "bFlatBtn":
					if (m_currentKey == ImagePath.key.DFLAT_BFLAT) {
						m_currentKey = ImagePath.setRandomKeyImage(keysImg);
					} else {
						showIncorrectDialog();
					}
						break;
				default:
					break;
				}
			}
		};
		
		cSharpBtn.setOnAction(event -> {
			noteButtonPressed.accept(event);
		});
		fSharpBtn.setOnAction(event -> {
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
