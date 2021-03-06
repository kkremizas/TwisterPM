package com.example.twisterpm;

class ApiUtils {
    private ApiUtils(){

    }

    public static final String apiUrl = "https://anbo-restmessages.azurewebsites.net/api/";
    public static final String MY_PREFS = "MyPreferences";

    public static TwisterPMService getTwisterPMService() {
        return RetrofitClient.getClient(apiUrl).create(TwisterPMService.class);
    }
}
