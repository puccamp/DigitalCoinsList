package com.example.developer.moedasdigitais;

/**
 * Created by Breno Antunes on 20/10/16.
 */

public class Coin {
    private String id;// "bitcoin"
    private String name;// "Bitcoin"
    private String symbol;// "BTC"
    private int rank;// "1"
    private double price_usd;// "631.081"
    private double price_btc;// "1.0"
    private double one_day_volume_usd;//": "66728600.0"
    private double market_cap_usd;// "10053877627.0"
    private double available_supply;// "15931200.0"
    private double total_supply;// "15931200.0"
    private double percent_change_1h;// ?"-0.01"
    private double percent_change_24h;// "-0.77"
    private double percent_change_7d;// "-0.92"
    private long last_updated;// "1476965967"

    @Override
    public String toString() {
        return "Coin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rank=" + rank +
                ", price_usd=" + price_usd +
                ", price_btc=" + price_btc +
                ", one_day_volume_usd=" + one_day_volume_usd +
                ", market_cap_usd=" + market_cap_usd +
                ", available_supply=" + available_supply +
                ", total_supply=" + total_supply +
                ", percent_change_1h=" + percent_change_1h +
                ", percent_change_24h=" + percent_change_24h +
                ", percent_change_7d=" + percent_change_7d +
                ", last_updated=" + last_updated +
                '}';
    }

    public Coin(){
    }

    public Coin(String id, String name, String symbol, int rank, double price_usd, double price_btc, long one_day_volume_usd, long market_cap_usd, double available_supply, long total_supply, double percent_change_1h, double percent_change_24h, double percent_change_7d, long last_updated) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price_usd = price_usd;
        this.price_btc = price_btc;
        this.one_day_volume_usd = one_day_volume_usd;
        this.market_cap_usd = market_cap_usd;
        this.available_supply = available_supply;
        this.total_supply = total_supply;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.last_updated = last_updated;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getRank() {
        return rank;
    }

    public double getPrice_usd() {
        return price_usd;
    }

    public double getPrice_btc() {
        return price_btc;
    }

    public double getOne_day_volume_usd() {
        return one_day_volume_usd;
    }

    public double getMarket_cap_usd() {
        return market_cap_usd;
    }

    public double getAvailable_supply() {
        return available_supply;
    }

    public double getTotal_supply() {
        return total_supply;
    }

    public double getPercent_change_1h() {
        return percent_change_1h;
    }

    public double getPercent_change_24h() {
        return percent_change_24h;
    }

    public double getPercent_change_7d() {
        return percent_change_7d;
    }

    public long getLast_updated() {
        return last_updated;
    }
}
