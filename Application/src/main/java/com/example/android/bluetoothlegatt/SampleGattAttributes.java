/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "厂商设备信息");
        //I add some code here for debugging purpose.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb","【服务】1");  //代码使用UTF-8编码，在手机就不会出现乱码
        attributes.put("00001801-0000-1000-8000-00805f9b34fb","【服务】2");
        attributes.put("0000fff0-0000-1000-8000-00805f9b34fb","最后一个服务");


        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "厂商设备信息");

        // Our developer specific Characteristics.
        // 服务1
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb","服务1-特征值2");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb","服务1-特征值3");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb","服务1-特征值4");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb","服务1-特征值5");

        // 服务2
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb","服务2-特征值1");

        // 厂商设备信息
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb","服务1-特征值1");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb","服务1-特征值1");


        // 最后一个服务
        attributes.put("0000fff1-0000-1000-8000-00805f9b34fb","最后服务-特征值1");
        attributes.put("0000fff2-0000-1000-8000-00805f9b34fb","最后服务-特征值2");
        attributes.put("0000fff3-0000-1000-8000-00805f9b34fb","最后服务-特征值3");
        attributes.put("0000fff4-0000-1000-8000-00805f9b34fb","最后服务-特征值4");
        attributes.put("0000fff5-0000-1000-8000-00805f9b34fb","最后服务-特征值5");
        attributes.put("0000fff6-0000-1000-8000-00805f9b34fb","最后服务-特征值6");
        attributes.put("0000fff7-0000-1000-8000-00805f9b34fb","最后服务-特征值7");





    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
