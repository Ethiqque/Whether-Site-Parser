package com.ethique;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WeatherDataPrinter {
    public void printWeatherData(Document page) throws Exception {
        DateParser dateParser = new DateParser();
        Element tableWth = page.select("table[class=wt]").first();
        Elements names = tableWth.select("tr[class=wth]");
        Elements values = tableWth.select("tr[valign=top]");
        int index = 0;
        for (Element name : names) {
            String dateString = name.select("th[id=dt]").text();
            String date = dateParser.getDateFromString(dateString);
            System.out.format("%-19s %-56s %-20s %-20s %-23s %-20s%n", date, "Явление", "Температура", "Давление", "Влажность", "Ветер");
            int iterationCount = printPartValues(values, index);
            index += iterationCount;
            System.out.println();
        }
    }

    private int printPartValues(Elements values, int index){
        int iterationCount = 4;
        if(index == 0) {
            Element valueLn = values.get(3);
            boolean isMorning = valueLn.text().contains("Утро");
            if (isMorning) {
                iterationCount = 3;
            }
        }
        for(int i=0; i < iterationCount; i++){
            Element valueLine = values.get(index + i);
            for (Element td : valueLine.select("td")) {
                System.out.print(td.text());
                String value = td.text();
                int size = 20 - td.text().length();
                if(td.text().length() >= 27)
                    size = 60 - td.text().length();

                for (int j = 0; j < size; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return iterationCount;
    }
}
