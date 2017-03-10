package br.com.habitacao.teste01;

import java.io.File;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        /*   Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();*/

        FlowPane flowPane = new FlowPane();
        Scene s = new Scene(flowPane, 300, 300);

        Canvas c = new Canvas(300,300);
        GraphicsContext context = c.getGraphicsContext2D();
        context.strokeLine(0, 0, 200, 100);

        flowPane.getChildren().add(c);

        /**
         * **************Navegador na aplicação*******************************
         */
//        WebView wv = new WebView();
//
//        WebEngine engine = wv.getEngine();
//
//        engine.load("http://www.google.com.br");
//
//        flowPane.getChildren().add(wv);
        /**
         * *******************CHART*******************************************
         */
//        CategoryAxis lx = new CategoryAxis();
//        NumberAxis ly = new NumberAxis();
//
//        BarChart<String, Number> grafico = new BarChart<>(lx, ly);
//        flowPane.getChildren().add(grafico);
//
//        XYChart.Series<String, Number> maria = new XYChart.Series<>();
//        maria.setName("Maria");
//        XYChart.Series<String, Number> jose = new XYChart.Series<>();
//        jose.setName("José");
//        XYChart.Series<String, Number> pedro = new XYChart.Series<>();
//        pedro.setName("pedro");
//
//        Random randomGenerator = new Random();
//        int randomM = randomGenerator.nextInt(2500);
//        int randomJ = randomGenerator.nextInt(2500);
//        int randomP = randomGenerator.nextInt(2500);
//
//        maria.getData().add(new XYChart.Data<String, Number>("JAN", randomM));
//        jose.getData().add(new XYChart.Data<String, Number>("JAN", randomJ));
//        pedro.getData().add(new XYChart.Data<String, Number>("JAN", randomP));
//
//        randomM = randomGenerator.nextInt(2500);
//        randomJ = randomGenerator.nextInt(2500);
//        randomP = randomGenerator.nextInt(2500);
//
//        maria.getData().add(new XYChart.Data<String, Number>("FEV", randomM));
//        jose.getData().add(new XYChart.Data<String, Number>("FEV", randomJ));
//        pedro.getData().add(new XYChart.Data<String, Number>("FEV", randomP));
//
//        randomM = randomGenerator.nextInt(2500);
//        randomJ = randomGenerator.nextInt(2500);
//        randomP = randomGenerator.nextInt(2500);
//
//        maria.getData().add(new XYChart.Data<String, Number>("MAR", randomM));
//        jose.getData().add(new XYChart.Data<String, Number>("MAR", randomJ));
//        pedro.getData().add(new XYChart.Data<String, Number>("MAR", randomP));
//
//        grafico.getData().addAll(maria, jose, pedro);
        /**
         * ********************TABELA*****************************************
         */
//        BorderPane borderPane = new BorderPane();
//
//        Scene s = new Scene(borderPane, 300, 300);
//
//        TableView<Contato> t = new TableView<>();
//        ObservableList<Contato> contatos = FXCollections.observableArrayList();
//        contatos.add(new Contato("Michel Adriano", "Medeiros", "ziguifridx@bol.com.br"));
//        contatos.add(new Contato("a", "a", "a@bol.com.br"));
//        contatos.add(new Contato("SR.", "TESTE", "teste@bol.com.br"));
//
//        t.setItems(contatos);
//
//        //Cria as colunas para a tabela
//        TableColumn<Contato, String> colunaNome = new TableColumn<>("Nome");
//        colunaNome.setCellValueFactory(new PropertyValueFactory<Contato, String>("nome"));
//        t.getColumns().add(colunaNome);
//
//        TableColumn<Contato, String> colunaSobreNome = new TableColumn<>("Sobrenome");
//        colunaSobreNome.setCellValueFactory(new PropertyValueFactory<Contato, String>("sobrenome"));
//        t.getColumns().add(colunaSobreNome);
//
//        TableColumn<Contato, String> colunaEmail = new TableColumn<>("Email");
//        colunaEmail.setCellValueFactory(new PropertyValueFactory<Contato, String>("email"));
//        t.getColumns().add(colunaEmail);
//
//        borderPane.setCenter(t);
        //************************************Imagens**************************/
        //a imagem deve ser colocada em src/main/resources/
//        Image image = new Image("/img/maoItaliana.png");
//
//        ImageView iv = new ImageView(image);
//
//        flowPane.getChildren().add(iv);
        /**
         * **************************MENU**********************************
         */
//        BorderPane b = new BorderPane();
//
//        Scene s = new Scene(b, 300, 300);
//
//        MenuBar m = new MenuBar();
//
//        Menu menu = new Menu("Arquivo");
//
//        MenuItem novo = new MenuItem("Novo");
//        MenuItem abrir = new MenuItem("Abrir");
//        MenuItem sair = new MenuItem("Sair");
//
//        sair.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.exit(0);
//            }
//        });
//
//        menu.getItems().addAll(novo, abrir, sair);
//
//        m.getMenus().add(menu);
//
//        b.setTop(m);

        /* ****************************Clique do mouse eventos nos botões***********************/
//        Scene s = new Scene(flowPane, 300, 300);
//
//        s.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                switch (event.getButton()) {
//                    case SECONDARY:
//                        event.consume();
//                        break;
//                    case MIDDLE:
//                        event.consume();
//                        break;
//                }
//            }
//        });
//
//        s.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//
//                System.out.println("primeiro ");
//
//            }
//
//        });
        /**
         * ****************************Clique do mouse eventos nos
         * botões***********************
         */
//        Scene s = new Scene(flowPane, 300, 300);
//
//        s.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                Integer qtdCliques = event.getClickCount();
//                switch (event.getButton()) {
//                    case PRIMARY:
//                        System.out.println("primeiro ");
//                        break;
//                    case SECONDARY:
//                        System.out.println("segundo ");
//                        break;
//                    case MIDDLE:
//                        System.out.println("terceiro ");
//                }
//                System.out.println(qtdCliques);
//            }
//
//        });
        /**
         * *************************TECLADO******************************************
         */
//        Scene s = new Scene(flowPane, 300, 300);
//        
//        s.setOnKeyTyped(new EventHandler<KeyEvent>(){
//            @Override
//            public void handle(KeyEvent event) {
//                System.out.println(event.getCharacter());
//            }
//            
//        });
        /**
         * *************************TECLADO*****************************************
         */
//LABEL
//        Label l = new Label();
//        l.setText("EX1");
        /**
         * ***************Botões********************************************
         */
//        Button b = new Button();
//        b.setText("Clique");
//
////        b.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
////            @Override
////            public void handle(ActionEvent event) {
////                System.out.println("clicou");
////            }
////        });
//
//        b.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("clicou versão 2");
//            }
//        });
        // flowPane.getChildren().add(b);
        /**
         * ***************Botões********************************************
         */
        /* ***************Combobox*********************************************/
//        ObservableList<String> frutas = FXCollections.observableArrayList("Maçã", "Uva");
//        ComboBox c = new ComboBox(frutas);
//
//        c.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
//            @Override
//            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println(newValue);
//            }
//        });
//
//        flowPane.getChildren().add(c);
/* ***************Combobox*********************************************/
        stage.setScene(s);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
