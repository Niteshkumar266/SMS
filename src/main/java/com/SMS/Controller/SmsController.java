package com.SMS.Controller;

import com.SMS.payload.SmsRequest;
import com.SMS.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    //http://localhost:8080/send-sms
    @PostMapping("/send-sms")
    public String sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
        return "SMS sent successfully!";
    }

    }


