package com.example.developer.moedasdigitais;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Breno Antunes on 27/10/16.
 */

public class AdapterCoin extends ArrayAdapter<Coin> {

    public List<Coin> coinsList;

    public Context context;
    ArrayList<Coin> arraylist;

    public AdapterCoin(Context context, int resource, List<Coin> items) {
        super(context, resource, items);
        this.coinsList = items;
        this.context = context;
        arraylist = new ArrayList<Coin>();
        arraylist.addAll(coinsList);
    }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.linha, null);
        }

        Coin moeda = getItem(position);

        if (moeda != null) {
            TextView tvTitulo = (TextView) v.findViewById(R.id.titulo);
            TextView tvPriceBtc = (TextView) v.findViewById(R.id.price_btc);
            TextView tvPriceUsd = (TextView) v.findViewById(R.id.price_usd);

            if (tvTitulo != null) {
                tvTitulo.setText(moeda.getName() + " ("+ moeda.getSymbol() +")");
            }

            if (tvPriceBtc != null) {
                tvPriceBtc.setText("Price in BTC: " + String.valueOf(moeda.getPrice_btc()));
            }

            if (tvPriceUsd != null) {
                tvPriceUsd.setText("Price in USD: " + String.valueOf(moeda.getPrice_usd()));
            }
        }

        return v;
    }

    public void filter(String charText) {

        charText = charText.toLowerCase(Locale.getDefault());

        coinsList.clear();
        if (charText.length() == 0) {
            coinsList.addAll(arraylist);

        } else {
            for (Coin coinDetail : arraylist) {
                if (charText.length() != 0 && coinDetail.getName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    coinsList.add(coinDetail);
                }

                else if (charText.length() != 0 && coinDetail.getName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    coinsList.add(coinDetail);
                }
            }
        }
        notifyDataSetChanged();
    }
}