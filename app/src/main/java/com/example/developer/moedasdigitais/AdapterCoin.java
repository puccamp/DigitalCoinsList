package com.example.developer.moedasdigitais;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by developer on 27/10/16.
 */

public class AdapterCoin extends ArrayAdapter<Coin> {


public AdapterCoin(Context context, int resource, List<Coin> items) {
        super(context, resource, items);
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
                tvTitulo.setText(moeda.getName());
            }

            if (tvPriceBtc != null) {
                tvPriceBtc.setText("Bitcon: " + String.valueOf(moeda.getPrice_btc()));
            }

            if (tvPriceUsd != null) {
                tvPriceUsd.setText("USD: " + String.valueOf(moeda.getPrice_usd()));
            }
        }

        return v;
    }
}