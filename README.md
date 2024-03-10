# Whether-Site-Parser


Overview
The Weather Site Parser is a application designed to aggregate and present weather forecasts from the https://www.pogoda.spb.ru/ website. This utility provides users with the current day's weather conditions as well as forecasts for the subsequent three days.

Operational Details
The functionality of the Weather Site Parser is intricately designed to adapt based on the time of execution, relative to Moscow time. Specifically, should the application be initiated post the morning hours, it will judiciously omit the morning weather data from its output. This adjustment is predicated on the rationale that the morning period would have already elapsed, rendering the data for that time frame irrelevant. This principle of temporal relevance is similarly applied to the day, evening, and night segments, ensuring that users receive the most current and applicable weather information.

Visualization
Below is a screenshot illustrating the application’s interface and the presentation of weather data:


![Screenshot 2024-03-08 140736](https://github.com/Ethiqque/Whether-Site-Parser/assets/130308635/4022bcc4-1a03-4f44-b64b-09f016810a48)
