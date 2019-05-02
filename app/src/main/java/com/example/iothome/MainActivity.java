/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.iothome;

import android.os.AsyncTask;
import android.os.Bundle;
import android.content.Intent;;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.util.Log;
import java.text.NumberFormat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void openDrawingRoom(View view){

        Intent intent = new Intent(this, DrawingRoom.class);
        startActivity(intent);
     }
    public void openStudyRoom(View view){

        Intent intent = new Intent(this, StudyRoom.class);
        startActivity(intent);
    }
    public void openLivingRoom(View view){

        Intent intent = new Intent(this, LivingRoom.class);
        startActivity(intent);
    }
    public void openBathRoom(View view){

        Intent intent = new Intent(this, BathRoom.class);
        startActivity(intent);
    }

}