package dad.javafx.calendario;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import components.MonthCalendar;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CalendarioController implements Initializable {

	IntegerProperty year = new SimpleIntegerProperty();

	@FXML
	private VBox view;

	@FXML
	private Button retrocederButton, avanzarButton;

	@FXML
	private Label anioLabel;

	@FXML
	private MonthCalendar eneroMCalendar, febreroMCalendar, marzoMCalendar, abrilMCalendar, mayoMCalendar,
			junioMCalendar, julioMCalendar, agostoMCalendar, septiembreMCalendar, octubreMCalendar, noviembreMCalendar,
			diciembreMCalendar;

	public CalendarioController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalendarioView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		view.getStylesheets().add(getClass().getResource("/css/calendario.css").toExternalForm());
		year.set(LocalDate.now().getYear());

		eneroMCalendar.yearProperty().bind(year);
		febreroMCalendar.yearProperty().bind(year);
		marzoMCalendar.yearProperty().bind(year);
		abrilMCalendar.yearProperty().bind(year);
		mayoMCalendar.yearProperty().bind(year);
		junioMCalendar.yearProperty().bind(year);
		julioMCalendar.yearProperty().bind(year);
		agostoMCalendar.yearProperty().bind(year);
		septiembreMCalendar.yearProperty().bind(year);
		octubreMCalendar.yearProperty().bind(year);
		noviembreMCalendar.yearProperty().bind(year);
		diciembreMCalendar.yearProperty().bind(year);
		
		anioLabel.textProperty().bind(yearProperty().asString());
	}

	public VBox getView() {
		return view;
	}

	@FXML
	void onAvanzarAction(ActionEvent event) {
		year.set(year.get() + 1);
	}

	@FXML
	void onRetrocederAction(ActionEvent event) {
		year.set(year.get() - 1);
	}

	public IntegerProperty yearProperty() {
		return this.year;
	}
	

	public int getYear() {
		return this.yearProperty().get();
	}
	

	public void setYear(final int year) {
		this.yearProperty().set(year);
	}
	

	
	
}
