package com.venkyezio42.Agents;

import org.springframework.stereotype.Service;

@Service
public class Defender implements iSide{
    @Override
    public String mission() {
        return "On Defending side.";
    }
}
