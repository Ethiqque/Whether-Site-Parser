package com.ethique;

import org.jsoup.nodes.Document;

public class WeatherParserApplication {
    public static void main(String[] args) throws Exception {
        WebPageFetcher fetcher = new WebPageFetcher();
        WeatherDataPrinter printer = new WeatherDataPrinter();
        Document page = fetcher.getPage("https://www.pogoda.spb.ru/");
        printer.printWeatherData(page);
    }
}
