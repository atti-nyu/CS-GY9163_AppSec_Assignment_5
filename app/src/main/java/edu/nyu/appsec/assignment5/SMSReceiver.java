package edu.nyu.appsec.assignment5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SMSReceiver extends BroadcastReceiver {
    private static final String SPELL_CHECK_URL = "http://appsecclass.report:8080/";

    @Override
    public void onReceive(Context context, Intent intent) { }  
}
