package com.example.developer.moedasdigitais;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Breno Antunes on 20/10/16.
 */

public class httpMarket extends AsyncTask<String, Void, ArrayList<Coin>>{


    @Override
    protected ArrayList<Coin> doInBackground(String... params) {
        HttpURLConnection urlConnection = null;
        String resultString = "";
        try {
            URL url = new URL("https://api.coinmarketcap.com/v1/ticker");
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            resultString = readStream(in);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            urlConnection.disconnect();
        }

        Gson gson = new Gson();

        JsonArray coinsArray = gson.fromJson(resultString, JsonArray.class);

        ArrayList<Coin> coinsList = new ArrayList<Coin>();
        Coin coinObject;
        for (JsonElement coin: coinsArray) {
            coinObject = gson.fromJson(coin.getAsJsonObject(), Coin.class);
            coinsList.add(coinObject);
        }
        return coinsList;
    }


    private String readStream(InputStream is) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while(i != -1) {
                bo.write(i);
                i = is.read();
            }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }
}
