package com.example.developer.moedasdigitais;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Breno Antunes on 27/10/16.
 */

public class CoinDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String coinString = intent.getStringExtra("coin");
        Gson gson = new Gson();
        Coin coin = gson.fromJson(coinString,Coin.class);

        setTitle(coin.getName());
        setContentView(R.layout.activity_coin_detail);


        //Fill page
        TextView tvRank = (TextView) findViewById(R.id.tvRank);
        TextView tvSymbol = (TextView) findViewById(R.id.tvSymbol);
        TextView tvPriceBtc = (TextView) findViewById(R.id.tvPrice_btc);
        TextView tvPriceUsd = (TextView) findViewById(R.id.tvPrice_usd);
        TextView tvTotalSupply = (TextView) findViewById(R.id.tvTotalSupply);
        TextView tvPercentageOneHour = (TextView) findViewById(R.id.tvPercentage1h);
        TextView tvPercentageOneDay = (TextView) findViewById(R.id.tvPercentage24h);
        TextView tvPercentageOneWeek = (TextView) findViewById(R.id.tvPercentageOneWeek);
        tvRank.setText(String.valueOf(coin.getRank()));
        tvSymbol.setText(coin.getSymbol());
        tvPriceBtc.setText(String.valueOf(coin.getPrice_btc()));
        tvPriceUsd.setText(String.valueOf(coin.getPrice_usd()));
        tvTotalSupply.setText(String.valueOf(coin.getTotal_supply()));
        tvPercentageOneHour.setText(String.valueOf(coin.getPercent_change_1h()) + "%");
        tvPercentageOneDay.setText(String.valueOf(coin.getPercent_change_24h()) + "%");
        tvPercentageOneWeek.setText(String.valueOf(coin.getPercent_change_7d()) + "%");

    }
}
