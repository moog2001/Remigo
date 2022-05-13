package com.example.remigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

//        List<Memo> memoList = new ArrayList<>();;
//        User user = new User("TestUser", "test@test.com", "testPass", 1,
//              false, "TestFName", "TestLName", 18, "Male");
//
//        Memo memo = new Memo("TestMemo", "Testing", 1, LocalDate.now());
//        memoList.add(memo);
//        user.setMemoList(memoList);
//
//        System.out.println(user.getUserId());
    }

    public static void main(String[] args) {
        launch();
    }
}