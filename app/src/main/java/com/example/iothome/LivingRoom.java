package com.example.iothome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.net.HttpURLConnection;

public class LivingRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);
    }

    public void CreateTask(View view){

        makeHTTPStance();
        displayStatus();
    }

    private String makeHTTPStance(URL url) throws IOException{

        URL url = createURL("API LINK HERE");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
    }
    private String createURL(String url){

            URL url = new URL(url);

    }

}
