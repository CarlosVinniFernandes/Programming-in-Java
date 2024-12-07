import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PrevisaoDeTemperatura {
    @SerializedName("hourly")
    private Hourly hourly;

    public Hourly getHourly() {
        return hourly;
    }

    public static class Hourly{
        @SerializedName("data")
        private List<HourlyData> data;

        public List<HourlyData> getData() {
            return data;
        }
    }

    public  static  class HourlyData{
        @SerializedName("date")
        private String date;

        @SerializedName("temperature")
        private double temperature;

        public String getDate(){
            return date;
        }

        public Double getTemperature(){
            return temperature;
        }
    }
}
