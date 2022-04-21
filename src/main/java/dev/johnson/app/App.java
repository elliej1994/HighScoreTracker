package dev.johnson.app;

import com.google.gson.Gson;
import dev.johnson.models.Score;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class App {

    static List<Score> scoreList = new ArrayList<>();
    static Gson gson = new Gson();
    public static void main(String[] args) {


        Javalin app = Javalin.create();


        app.get("/scores", context -> {
            String scoreJSON = gson.toJson(scoreList);
            context.result(scoreJSON);

        });
        app.post("/scores", context -> {
            String json = context.body();
            Score score = gson.fromJson(json,Score.class);
            scoreList.add(score);
            context.status(201);
            context.result("score was added!");
        });

        app.start(5000);
    }
}
